//fun fibonacci_recursive(n) {
//    if (n<=1){
//        return n
//    }else{
//        return fibonacci_recursive(n-1) + fibonacci_recursive(n-2)
//    }
//}
//fun main() {
//    var n = readln().toInt()
//    var result = fibonacci_recursive(n)
//    println("The ${n} th Fibonacci number is: ${result}")
//}


fun main() {
    val n = 10
    var a = 0
    var b = 1
    for (i in 1 ..n){
        print("$a ")
        val next = a + b
        a = b
        b = next
    }
}