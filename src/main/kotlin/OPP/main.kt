package OPP//package OPP
//
//class Socket(var timeout: Int, var linger: Int) {
//    init {
//        println("Entered 'init' ")
//        println("timeout = ${timeout}, linger = ${linger}")
//    }
//}
//
//fun main() {
//    val s = Socket(2000, 3000)
//
//}

//class Person(val firstName: String, val lastName: String) {
//    fun fullName() = "$firstName $lastName"
//}
//
//fun main() {
//    val p = Person("Hala","Cina")
//    println( p.fullName())
//}

//Properties

//class InampClass(){
//    val x = 4
//}
//class Inhe : InampClass(){
//    fun aclass(){
//        println(x)
//    }
//
//}


abstract class Pet (name: String) {
    abstract fun comeToMaster(): Unit          //abstract, open by default
    fun walk(): Unit = println("I’m walking")  //concrete, closed (final)
    open fun speak(): Unit = println("Yo")     //concrete, open
}

class Dog(name: String) : Pet(name) {
    override fun speak() = println("Woof")
    override fun comeToMaster() = println("Here I come!")
}

class Cat(name: String) : Pet(name) {
    override fun speak() = println("Meow")
    override fun comeToMaster() = println("That’s not gonna happen")
}

fun main(args: Array<String>) {

    val d = Dog("Zeus")
    d.walk()
    d.speak()
    d.comeToMaster()

    val c = Cat("Rusty")
    c.walk()
    c.speak()
    c.comeToMaster()

}