
package examples

class GuideToNullSafety() {

    init {
        println("###Guide to Null Safety###")
        printUsingLet(null)
        printUsingIf(null)
        printUsingSaf("Ricardo")
        printUsingSaf(null)
    }

    fun printUsingLet(nome: String?) {
        nome?.let { name ->
            println("O nome tem ${name.length} letras!")
        }
    }

    fun printUsingIf(nome: String?) {
        if (nome != null) {
            println("O nome tem ${nome.length} letras!")
        }
    }

    fun printUsingSaf(nome: String?) {
        var count = nome?.length ?: 0
        println("O nome tem $count letras!")
    }
}