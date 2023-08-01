//val names = listOf("Tom", "Jerry")
//println(names.javaClass)
//for ((index, value) in names.withIndex()) {
//  println("$index $value")
//}
//println(Pair("Tom", "Jerry")) // (Tom, Jerry)
//println(mapOf("Tom" to "Cat", "Jerry" to "Mouse")) //

val n = 5
val func = Array(n) { 0 }



for (i in 0 until n) {
  when (i) {
    0 -> func[i] = 0
    1 -> func[i] = 1
    else -> func[i] = func[i - 1] + func[i - 2]
  }
}



val sum = func.sum()
println(sum)

