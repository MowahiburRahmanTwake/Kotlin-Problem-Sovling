import java.util.Scanner


fun main(args: Array<String>) {
    var src = Scanner(System.`in`)
    var year = src.nextInt()
    if(year %400 == 0 || (year%100 != 0 && year%4 ==0)){
        println("${year} is a leap year")
    }else{
        println("${year} is not a leap year")
    }
}