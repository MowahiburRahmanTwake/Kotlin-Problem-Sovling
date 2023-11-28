import java.util.Scanner

fun main(args: Array<String>) {

    var B = Scanner(System.`in`)

    var num1:Int = B.nextInt()
    var num2:Int = B.nextInt()
    var num3:Int = B.nextInt()

    var sum = (num1+num2)*num3

    println("Copy ${sum}")
}