// 함수
fun createPerson(name: String, age: Int = 1, height: Int, weight: Int) {
  println("$name $age $height $weight")
}
// 1. 불친절
createPerson("Jake", 12, 152, 43)
// 2. weight 앞으로 보내는거
createPerson(name = "Jake", age = 12, weight = 43, height = 152)
// 3. 값만 전달한 어규먼트와 명시적 사용
createPerson("Jake", age = 12, weight = 152, height = 43)
// 4. 값만 전달한 어규먼트와 명시적 사용 2
createPerson("Jake", 12, weight = 152, height = 43)
// 5. age는 기본 값을 가지고 있어 다른 아규먼트를 모두 명시적으로 사용
createPerson(weight = 152, height = 43, name = "Jake")
// 6. age 이전의 파라미터는 위치에 기반해서 아규먼트를 전달하고, 나머지는 명시적 아규머트를 사용하는 경우 age 전달 X
createPerson("Jake", weight = 152, height = 43)
