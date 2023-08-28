fun max(vararg numbers: Int): Int {
  var large = Int.MIN_VALUE
  for (number in numbers) {
    large = if (number > large) number else large
  }
  return large;
}

println(max(1, 5, 2))
println(max(1, 5, 2, 12, 7, 3))

 val values = intArrayOf(1, 21, 3)
// error: type mismatch: inferred type is IntArray but Int was expected

println(max(*listOf(1, 4, 18, 12).toIntArray()))
