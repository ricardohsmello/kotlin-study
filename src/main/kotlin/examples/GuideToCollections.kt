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

    fun listImutable() {
        var myCollection = MyCollection()

        myCollection.listAdd("Ricardo")
        myCollection.listAdd("Henrique")

        println(myCollection.list)
        println(MyCollection().list)

    }
}
