val a = "package"
class B {
    val a = "sss"
    fun print(){
        println(a)
    }
}

fun main(){
    val a = "aaa"
    println(a)
    B().print()

    b(::a)

//    val c: (String)->Unit ={str->println("$str 람다 함수")}
    //축약형
    val c = {str:String->println("$str 람다함수")}
    b(c)
}

fun a(str:String){
    println("$str 함수 a")
}
fun b (function:(String)->Unit){
    function("b가 호출한")
}