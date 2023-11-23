import java.util.Scanner

fun main(args: Array<String>) {
    var sca = Scanner(System.`in`)

    var num1 = sca.nextInt()
    var num2 = sca.nextInt()
    var num3 = sca.nextInt()
//    fitst
    if(num1>num2 && num1> num3){
        println("num1: ${num1} is grather")
    } else if (num2>num1 && num2>num3){
        println("num2: ${num2} is grather")
    }else if (num3>num1 && num3>num2){
        println("num3: ${num3} is grather")
    }else if (num3 == num2 && num3>num1){
        println("num2:${num2} and num3:${num3} are greater")
    }else if (num1 ==num2 && num1>num3){
        println("num1:${num1} and num2:${num2} are greater")
    }else if (num1 ==num3 && num1>num2){
        println("num1:${num1} and num3:${num3} are greater.")
    }

    else{
        println("num1 = ${num1}, num2 = ${num2} and num3 = ${num3} are equale.")
    }





}