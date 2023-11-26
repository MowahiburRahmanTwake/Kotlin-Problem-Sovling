fun main() {
    var n = readln().toInt()
    var factorial = 1
    for (i in 1..n){
        factorial*=i
    }
    println("Factorial is:${factorial}")
}