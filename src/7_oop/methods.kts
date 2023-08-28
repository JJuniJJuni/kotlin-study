class Person(val first: String, val last: String) {
  // ...
  internal fun fullName() = "$last $first"
  private fun yearOfService(): Int =
    throw java.lang.RuntimeException("Not implemented yet")
}

val jane = Person("Jane", "Doe")
println(jane.fullName())
// jane.yearOfService() // ERROR 'Person' 클래스의 private 접근 X
