// [1]
 fun f(n: Int) = {param: Int -> n - param}
 println(f(5)(2))


// [2]
//fun f1() = 2
//fun f2(factor: Int) ={n: Int->n * factor}
//fun f3() ={2}
//fun f4(factor: Int) = 1 + factor
//println(f1())
//println(f2(2)(1))
//println(f3())
//println(f4(1))

// [3]

fun selectMaxSearchMember(vararg searchMembers: Int): Int {
  var large = Int.MIN_VALUE
  for (searchMember in searchMembers) {
    large = if (searchMember > large) searchMember else large
  }
  return large;
}
// 1번
//val values = intArrayOf(1, 21, 3)
//println(selectMaxSearchMember(values))

// 2번
//val values = intArrayOf(1, 21, 3)
//println(selectMaxSearchMember(values[0], values[1], values[2]))

// 3번

//val values = intArrayOf(1, 21, 3)
//println(selectMaxSearchMember(*values))

// 4번
println(selectMaxSearchMember(*listOf(1, 21, 3).toIntArray()))

// [4]

// 1번
//fun advertisement() = Triple("다연", "기환", "상민")
//val (first, _, last) = advertisement()
//println("$first $last")

// 3번
//fun clientApi() = Triple("혜린님", "지호", "다애님")
//val (_, middle) = clientApi()
//println(middle)
