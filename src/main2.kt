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
}

fun a(str:String){
    println("$str 함수 a")
}
fun b (function:(String)->Unit){
    function("b가 호출한")
}