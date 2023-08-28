val fruits: List<String> = listOf("Apple", "Banana", "Grape")
println(fruits) // [Apple, Banana, Grape]

println("first's ${fruits[0]}, that's ${fruits.get(0)}")
// first's Apple, that's apple

println(fruits.contains("Apple")) // true
println("Apple" in fruits) // true

// fruits.add("Orange") // ERROR: unresolved reference: add

val fruits2 = fruits + "Orange"
println(fruits) // [Apple, Banana, Grape]
println(fruits2) // [Apple, Banana, Grape, Orange]

val noBanana = fruits - "Banana"
println(noBanana) // [Apple, Grape]

println(fruits::class) // class java.util.Arrays$ArrayList
println(fruits.javaClass) // class java.util.Arrays$ArrayList

val mutableFruits: MutableList<String> = mutableListOf("Apple", "Banana", "Grape")
println(mutableFruits::class) // class java.util.ArrayList

mutableFruits.add("Orange")

println(mutableFruits)
