package model

data class Book(
    val title: String,
    val author: String,
    val year: Long,
    val editor: String
) : Comparable<Book> {
    override fun compareTo(other: Book): Int {
        return this.year.compareTo(other.year)
    }
}