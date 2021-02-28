package examples

import model.Book

class GuideToList {
    private var book01: Book = Book(title = "Revolução dos bichos", author = "George Orwell", 1945, null)
    private var book02 = Book(title = "Migrating to Microservice Databases", author = "Edson Yanaga", 2017, null)
    private var book03 = Book(title = "1984", author = "George Orwell", 1949, null)
    private var book04 = Book("Test", "Author", 1256, "Not null")

    fun printBooksOrderByYearWithComparable() {
        val books = getBooks()
        println(books.filterNotNull().sorted().formatStringUsingJoinString())
    }


    private fun List<Book>.formatStringUsingJoinString(): String {
        println("### PRINTING BOOKS ###")
        return this
//            .filterNotNull()
            .joinToString(separator = "\n") {
                " ${it.title} by ${it.author} of ${it.year}"
            }
    }

    fun printBooksWithSortedBy() {
        val books = getBooks()

        val sortedBy = books.sortedBy { book -> book.title }
        println(sortedBy.formatStringUsingJoinString())
    }

    private fun getBooks(): MutableList<Book> {
        return mutableListOf(book01, book02, book03, book04)
    }

    fun filterBookByAuthor(name: String) {
        val books = getBooks()
        println(books.filter {
            it.author == name
        }
            .sortedBy { it.year }
            .formatStringUsingJoinString())
    }

}
