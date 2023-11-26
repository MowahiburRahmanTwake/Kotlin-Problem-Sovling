fun main() {
    val a = readLine()!!.toInt()
    val b = readln()!!.toInt()
    var operator = readLine()

    var result =when(operator){
        "+" -> {
            a + b
        }
        "-" -> {
            a - b
        }
        "/" ->{
           a / b
        }
        "*" ->{
            a * b
        }
        else ->{
            "$operator is not value"
        }
    }
    println("Result = $result")
}