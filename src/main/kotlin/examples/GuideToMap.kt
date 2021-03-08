package examples

class GuideToMap {

    fun pairExample() {
        val mapOf = mapOf(Pair("Ricas", 123))
        println(mapOf)

        val mapOf2 = mapOf(
            Pair("Ricas", 123),
            Pair("Mello", 321)
        )
        println(mapOf2)

        val mapOf3 = mapOf(
            Pair("Ricas", 123),
            Pair("Mello", 321),
            "Henrique" to 2313
        )
        println(mapOf3)

    }

    fun pairWithInfix() {
        val mapOf = mapOf(
            1989 to "Ricardo Mello",
            1990 to "Julio fernandes"
        )
        println(mapOf)
    }

    fun getByKeyValue(key: Int) {
        val mapOf = mapOf(
            Pair(1, 51),
            2 to 10.0,
            Pair(3, "Mello"),
            Pair(4, null)
        )
        val result = mapOf[key]
        result?.let {
            println("finding key $key .. value = $it")
        }
    }

    fun addingValueMap() {
        val createMapIntString = createMapIntString()
        createMapIntString[3] = "Henrique"
        createMapIntString[4] = "Joao"
        println(createMapIntString)
    }

//Não deixa substituir o valor caso ja exista essa chave cadastrada
    fun puttingIfAbsent() {
        val createMapIntString = createMapIntString()
        createMapIntString.putIfAbsent(1, "Joao")
        println(createMapIntString)
    }

    fun removing() {
        val createMapIntString = createMapIntString()
        createMapIntString.remove(1)
        println(createMapIntString)
    }

    //Nao vai conseguir remover, pois a posicao 1 existe, mas o valor que lá contem é diferente de jose
    fun removingIfValueAndKeyMatch () {
        val removingIfValueAndKeyMatch = createMapIntString()
        removingIfValueAndKeyMatch.remove(1, "Jose")
        println(createMapIntString())
    }


    fun getValue() {
        val mutableListOf: MutableMap<Int, String?> = mutableMapOf(Pair(1, "Ricardo"), 2 to "Pedro", 3 to null)
        println(mutableListOf[3])
        println(mutableListOf.getValue(4))
    }

    fun getOrElse() {
        val createMapIntString = createMapIntString()
        println(createMapIntString.getOrElse(4, {
            "Position doesn't exists"
        }))
    }

    private fun createMapIntString(): MutableMap<Int, String> {
        return mutableMapOf(Pair(1, "Ricardo"), Pair(2, "Mello"))
    }

    fun getOrDefault() {
        val createMapIntString = createMapIntString()
        println(createMapIntString.getOrDefault(3, "Key 3 doesn't exists. Default value is it bla bla"))
    }

    fun filterValues(filter: String) {

        val createMapIntString = createMapIntString()
        println(createMapIntString.filterValues { value ->
            (
                    when (filter) {
                        value -> true
                        else -> false
                    }

                    )
        })
    }

    fun plusOperation() {

        val createMapIntString = createMapIntString()
        val mutableMapOf = mutableMapOf(Pair(3, "Ricas"))
        println(createMapIntString + mutableMapOf)
    }

}