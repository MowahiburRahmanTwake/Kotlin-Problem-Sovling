fun gpa() {

    var score = readLine()!!.toInt()
    if (90 <= score && score <= 100){
        println("GPA: 4.0")
    } else if (80 <= score && score < 90){
        println("GPA: 3.5")
    }else if(70 <= score && score < 80){
        println("GPA: 3.0")
    }else if(60 <= score && score < 70){
        println("GPA: 2.5")
    }else if(50 <= score && score < 60){
        println("GPA: 2.0")
    }else{
        println("You failed")
    }
}
fun main() {
    gpa()
}