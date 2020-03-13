
fun main(src:Array<String>) {
    println("hello world")

    var a = Person("박보영", 1990)
    var b = Person("이지금", 1993)
    var c = Person("황윤지")

    println("${a.birthYear}년생 ${a.name}")
    b.introduce()

    var d = Animal("레오", 5, "개")
    var e = Dog("레오", 5)

    d.introduce()
    e.introduce()
    e.bark()

    var f = Cat("람다",2)
    f.introduce()
    f.meow()

    var g = Tiger()
    g.eat()

    var h = Wind()
    h.temperature()
    h.clothe()
}

abstract class Weather {
    abstract fun temperature()
    fun clothe(){
        println("옷을 입는댱")
    }
}

class Wind : Weather(){
    override fun temperature() {
        println("바람이 분댜")
    }
}

open class Animals {
    open fun eat(){
        println("음식을 먹는다")
    }
}

class Tiger : Animals(){
    override fun eat(){
        println("고기를 먹는댜")
    }
}

open class Animal (var name:String, var age:Int, var type:String){
    fun introduce(){
        println("저는 $type ${name}이고 ${age}살 입니다.")
    }
}

class Dog (name:String, age:Int):Animal(name,age,"개"){
    fun bark(){
        println("멍멍")
    }
}

class Cat (name:String,age:Int):Animal(name,age,"고양이"){
    fun meow(){
        println("야옹")
    }
}

class Person (var name:String, val birthYear:Int){
    init {
        println("${this.birthYear}년생 ${this.name}님이 생성되었습니다.")
    }
    constructor(name:String) :this(name,1991){
        println("보조생성자")
    }
    fun introduce(){
        println("${name}의 출생년도는 ${birthYear}년 입니다")
    }
}
