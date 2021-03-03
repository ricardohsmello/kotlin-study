
package examples

import model.Book

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

    fun with1(book: Book?) {

        with(book) {
            print("valor = ${this?.title}")
        }

        book.let {
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