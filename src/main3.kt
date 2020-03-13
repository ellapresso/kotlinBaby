fun main(){
    var price = 5000

    var a = Book("책 이름",10000).apply{
        name = "[초특가] " + name
        disconunt()
    }

    a.run{
        println("상품명 : ${name}, 가격 : ${price}원")
    }
    a.let{
        println("상품명 : ${it.name}, 가격 : ${it.price}")
    }

    //run 대신 let, apply대신 also
    //main 스코프 내에 이미 선언된 변수가 있어서 원하는 결과값이 나오지 않을 경우 사용해 준다고 함.
}

class Book(var name: String, var price: Int){
    fun disconunt(){
        price -= 2000
    }
}