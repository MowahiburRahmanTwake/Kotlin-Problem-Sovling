//fun main(args : Array<String>) {
//    val number1: Int = 545344225
//    val number2: Byte = number1.toByte()
//    println("number1 = $number1")
//    println("number2 = $number2")
//}
//

//import java.util.Scanner

//fun main(args: Array<String>) {
//    var sc =Scanner(System.`in`)
//    var name =sc.nextInt()
//
//    println("My name is ${name}")
//}

//fun main(args: Array<String>) {
//    var sc = Scanner(System.`in`)
//    var number1 = sc.nextInt()
//    var number2 = sc.nextInt()
//    var number3 = sc.nextInt()
//         
//    if (number1>number2 && number1 > number3){
//        println("number1 is grather")
//    } else if (number2 > number1 && number2 > number3){
//        println("number2 is grather")
//
//    }else if (number3 > number1 && number3 >number2){
//        println("number3 is grather")
//    }else{
//        println("All number are equal")
//    }

//    var result = number1 + number2 + number3
//    println("number1: ${number1}, number2: ${number2} and number3: ${number3} result is = ${result} ")
//}

fun main() {
    val student = arrayOf("Twake","Wahidul","Imran","Mursalin")
//    println(student[0])
    var index = 2
    while (index <= student.size){
        println(student[index])
        index++

    }
}