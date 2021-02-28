package examples
class GuideToConditions {

    constructor(){
        println("###Guide to Null Safety###")
    }

    fun whatIsTheGreatestNumberUsingWhen(n1: Int, n2: Int) {
        when {
            n1 > n2 -> println("n1 maior que n2")
            n1 < n2 -> println("n2 maior que n1")
            n1 == n2 -> println("São iguais")
        }
    }

    fun whatIsTheGreatestNumberUsingIf(n1: Int, n2: Int, n3: Int): Int {
        return if (n1 > n2 && n1 > n3)
            n1
        else if (n2 > n3)
            n2
        else {
            n3
        }
    }
}



