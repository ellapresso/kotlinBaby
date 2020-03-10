
fun main(src:Array<String>){
    println("hello world")

    var a = Person("박보영",1990)
    var b = Person("이지금",1993)
    var c = Person("황윤지")

    println("${a.birthYear}년생 ${a.name}")
    b.introduce()
}

class Person (var name:String, val birthYear:Int){
    init {
        println("${this.birthYear}년생 ${this.name}님이 생성되었습니다.")
    }
    constructor(name:String) :this(name,1997){
        println("보조생성자")
    }
    fun introduce(){
        println("${name}의 출생년도는 ${birthYear}년 입니다")
    }
}