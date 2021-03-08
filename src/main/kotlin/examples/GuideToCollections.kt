package examples

class GuideToCollections {

    class MyCollection() {
        val list: Collection<String> get() = data.toList()

        fun listAdd(string: String) {
            data.add(string)
        }

        companion object {
            private var data = mutableListOf<String>()
        }

    }

    fun listMutable() {
        var mutable = mutableListOf("Ricardo")
        mutable.add("Henrique")

        for (m in mutable)
            println(m)
    }

    fun distinctList() {
        val listOf = listOf("Ricardo", "Julio", "Carlos", "Maria")
        val listOf1 = listOf("Ricardo", "Pedro", "Fernando", "Maria")

        println((listOf + listOf1).distinct())
    }

    fun listImutable() {
        var myCollection = MyCollection()

        myCollection.listAdd("Ricardo")
        myCollection.listAdd("Henrique")

        println(myCollection.list)
        println(MyCollection().list)

    }
}
