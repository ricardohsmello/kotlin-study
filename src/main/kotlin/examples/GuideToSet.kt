package examples

class GuideToSet {

    fun plusExample() {
        val of = setOf("Ricas")
        val of1 = setOf("Mello")

        println(of.plus(of1))
    }

    fun operationExample() {
        val of = setOf("Ricas")
        val of1 = setOf("Mello")

        println(of + of1)
    }

    fun unionExample() {
        val of = setOf("Ricas")
        val of1 = setOf("Mello")

        println(of.union(of1))
    }

    fun subtractExample() {
        val of = setOf("Ricas", "Mello", "Joao", "Carlos", "Rubens")
        val of1 = setOf("Mello", "Pedro", "Fernando", "Carlos")

        println(of subtract of1)
    }

    fun intersectExample() {
        val of = setOf("Ricas", "Henrique", "Pedro")
        val of1 = setOf("Mello", "Pedro", "Ricardo", "Ricas")

        println(of intersect of1)
    }
}