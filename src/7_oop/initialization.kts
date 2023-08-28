class Car(val yearOfMake: Int, theColor: String) {
  var fuelLevel = if (yearOfMake < 2020) 90 else 100
    private set
  var color = theColor
    set(value) {
      if(value.isBlank()) {
        throw java.lang.RuntimeException("no empty, please")
      }
      field = value
    }
  init {
    if (yearOfMake < 2020) {
      fuelLevel = 90
    }
  }
}
