class MachineOperator private constructor (val name: String) {
  fun checkin() = checkedIn++
  fun checkout() = checkedIn--

  // companion object
  companion object  {
    var checkedIn = 0
    fun minimumBreak() = "15 minutes every 2 hours"
    fun create(name: String): MachineOperator {
      val instance = MachineOperator(name)
      instance.checkin()
      return instance
    }
  }
  // ...
}

//MachineOperator("Mater").checkin()
//println(MachineOperator.minimumBreak()) // 15 minutes every 2 hours
//println(MachineOperator.checkedIn) // 1

val operator = MachineOperator.create("Mater")
println(MachineOperator.checkedIn) // 1

