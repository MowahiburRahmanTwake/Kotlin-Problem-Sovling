fun main() {
    println("Enter the year: ")
    var year:Int = readLine()!!.toInt()
    if (year%2 == 0){
        if (year % 400 == 0 || year % 100 != 0 && year % 4 == 0){
            println("${year} is a leap year and Even")
        }else{
            println("${year} isn't a leap year and Even")
        }
    }else{
        if (year % 400 == 0 || year % 100 != 0 && year % 4 == 0){
            println("${year} is a leap year and Odd")
        }else{
            println("${year} isn't a leap year and Odd")
        }
    }
}