package examples
class GuideToWhen {

    constructor(){
        println("###Guide to Null Safety###")
    }

    fun whatIsTheBiggestNumber(n1: Int, n2: Int) {
        when {
            n1 > n2 -> println("n1 maior que n2")
            n1 < n2 -> println("n2 maior que n1")
            n1 == n2 -> println("São iguais")
        }
    }
}



