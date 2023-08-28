public class Car public constructor (public val yearOfMake: Int)

val car = Car(2019)
println(car.yearOfMake) // 2019

// car.yearOfMake = 2019 // ERROR: val cannot be reassigned
