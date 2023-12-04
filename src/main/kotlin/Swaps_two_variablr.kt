fun swapNumbers(var1:Int ,var2:Int):
    Pair<Int ,Int> {
        return Pair(var1, var2)
}

fun main() {
    var a = readLine()!!.toInt()
    var b = readLine()!!.toInt()

    val(swapped1, swapped2) = swapNumbers(a , b)
    println("Orginal number: ${a}, ${b}")
    println("Swapped number: ${swapped1}, ${swapped2}")
}