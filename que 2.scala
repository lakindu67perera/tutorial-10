object main extends App{
// Define a function that takes a list of words as input
def countLetterOccurrences(words: List[String]): Int = {
  // Use the map function to transform the words into their respective lengths
  val lengths = words.map(word => word.length)
  // Use the reduce function to calculate the total count of letter occurrences
  val total = lengths.reduce((a, b) => a + b)
  // Return the total count
  return total
}

// Test the function with an example input
val input = List("apple", "banana", "cherry", "date")
val output = countLetterOccurrences(input)
println("Input: " + input)
println("Output: Total count of letter occurrences: " + output)
}