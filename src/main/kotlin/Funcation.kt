fun main() {
    println("Simple Calculator")
    calculator()
    name()

}

fun calculator() {
    println("Enter first number: ")
    val num1 = readLine()!!.toDouble()
    println("Enter second number: ")
    val num2 = readLine()!!.toDouble()
    val sum = num1 + num2
    val add = num1 - num2
    val mult = num1 * num2
    val div = num1 / num2
    println("Sum = ${sum}")
    println("Add = ${add}")
    println("Mult = ${mult}")
    println("Div = ${div}")
}
fun name() {
    println("Product by Mawahibur")

}
fun last_name() {
    println("Twake")
}
