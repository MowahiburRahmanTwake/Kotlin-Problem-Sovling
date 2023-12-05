fun leap_year() {
    var year = readLine()!!.toInt()
    if(((year % 400) == 0) || (((year % 100) != 0) && ((year % 4) == 0))){
        println("${year} is a leap year")
    }else{
        println("${year} is not a leap year")
    }
}
fun main() {
    leap_year()
}