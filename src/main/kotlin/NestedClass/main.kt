package NestedClass

//fun main() {
//    val outer = Outer()
//    println(outer.a)
//    val nested = Outer.Nested()
//    println(nested.b)
//    println(nested.callme())
//}
fun main() {
    val outer = Outer()
    println(outer.a)
    val nested = outer.Nested()
    println(nested.b)
    println(nested.callme())
}