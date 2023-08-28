object main extends App{
// Define a function that takes a list of temperatures as input
def calculateAverage(temperatures: List[Double]): Double = {
  // Use the map function to convert each temperature to Fahrenheit
  val fahrenheit = temperatures.map(celsius => (celsius * 9/5) + 32)
  // Use the reduce function to calculate the sum of Fahrenheit temperatures
  val sum = fahrenheit.reduce((a, b) => a + b)
  // Calculate the average by dividing the sum by the number of elements
  val average = sum / fahrenheit.length
  // Return the average
  return average
}

// Test the function with an example input
val input = List(0.0, 10.0, 20.0, 30.0)
val output = calculateAverage(input)
println("Input: " + input)
println("Output: Average Fahrenheit temperature: " + output)
}