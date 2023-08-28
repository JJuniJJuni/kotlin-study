fun getTemperatureAtAirport(code: String): String =
  "${Math.round(Math.random() * 30) + code.count()} C"

val airportCodes = listOf("LAX", "SFO", "PDX", "SEA")
val temperatures =
  airportCodes.map {code -> code to getTemperatureAtAirport(code)}

for(temp in temperatures) {
  println("Airtport: ${temp.first}: Temperature: ${temp.second}")
}
