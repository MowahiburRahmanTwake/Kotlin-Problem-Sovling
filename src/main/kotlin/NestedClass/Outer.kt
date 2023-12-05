package NestedClass

//class Outer {
//    val a = "Nested class"
//    class Nested{
//        val  b = "Inside Nested class"
//        fun callme() = "Funcation call from"
//    }
//
//}

class Outer {
    val a = "Nested class"
    inner class Nested{
        val  b = "Inside Nested class"
        fun callme() = "Funcation call from"
    }

}