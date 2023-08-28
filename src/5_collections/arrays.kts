val friends = arrayOf("Tintin", "Snowy", "Haddock", "Calculus")

println(friends::class) // class kotlin.Array
println(friends.javaClass) // class [Ljava.lang.String;
println("${friends[0]} and ${friends[1]}") // Tintin and Snowy

val numbers = arrayOf(1, 2, 3)
println(numbers::class) // class kotlin.Array
println(numbers.javaClass) // class [Ljava.lang.Integer

val intNumbers = intArrayOf(1, 2, 3)
println(intNumbers::class) // class kotlin.IntArray
println(intNumbers.javaClass) // class [I

println(intNumbers.size)
println(intNumbers.average())

println(Array(5) { i -> (i + 1) * (i + 1)}.sum())
