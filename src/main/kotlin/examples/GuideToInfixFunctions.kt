package examples

class GuideToInfixFunctions {

    val list: Collection<String> get() = privateList.toList()

    companion object {
        private var privateList = mutableListOf<String>()
    }

    infix fun add(value: String) {
        privateList.add(value)
    }

    fun a () {
        1 + 2
    }


 }