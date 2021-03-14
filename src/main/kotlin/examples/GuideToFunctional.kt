package examples

class GuideToFunctional {
    fun exampleFunction() {
        val myFunction: () -> String = ::getString
        println(myFunction())
    }

    fun getString(): String {
        return "Test"
    }

    fun exampleFunctionWithClass() {
        var myFunction: (Int, Int) -> Int = Sum()
        println(myFunction(2, 5))
    }

    fun exampleFunctionWithLambdaAnUnitReturn() {
        var myFunction: () -> Unit = {
            println("My Lambda Expression")
        }

        myFunction()
    }

    //Underline siginifica que nao vai ser utulizado o param dentro do retorno do lambda
    fun exampleFunctionWithLambdaAnIntReturn() {
        var myFunction: (Int, Int, Int) -> Int = { n1, n2, _ -> n1 + n2 }
        println(myFunction(3, 5, 0))
    }

    fun exampleFunctionAnonymous() {
        var myFunction: () -> Unit = fun() {
            println("My Anonymous Function")
        }

        myFunction()
    }

    fun exampleFunctionAnonymousWithIntReturn() {
        var myFunction: (Int, Int) -> Int = fun(n1, n2): Int {
            println("My Anonymous Function")
            return n1 + n2
        }

        println(myFunction(1, 2))

        // OU

        var myFunction2 = fun(n1: Int, n2: Int): Int {
            println("My Anonymous Function")
            return n1 + n2
        }

        println(myFunction(21, 2))    }

    // retorno@ indica uma variável para armazenar o retorno, dado que em funcoes lambda, nao é possivel retornar duas vezes, somente na ultima instrucao
    fun exampleFunctionWithTwoResultsUsingLit() {

        var myFunction: (salary: Double) -> Double = retorno@{ salary ->
            if (salary > 100.0) {
                return@retorno salary * 2.0
            }

            salary
        }

        println(myFunction(110.0))
    }

    fun exampleMultiplyingWithHigherOrderFunction() {
        multiply(5, 2) {
            println(it)
        }
    }

    private fun multiply(n1: Int, n2: Int, result: (Int) -> Unit) {
        result(n1*n2)
    }

    class Sum : (Int, Int) -> Int {
        override fun invoke(p1: Int, p2: Int): Int {
            return p1+p2
        }
    }

    data class Ident(
        val id: String
    )

    data class IdentPayload(
        val aleixoId: String
    )


    fun Ident.toPayload() = IdentPayload (
        aleixoId = id
    )

    fun scopeFunctions() {

        val wallet = Wallet("My wallet", 1)

        wallet.let {
            Wallet(it.name, 2)
        }.also {
            println(it.number)
        }

        val wallet2 = Wallet("My wallet2", 35)
        val name = wallet2.apply {
            name = "new name"
            println(number)
        }.name

        println(name)
    }

    fun withContextObject() {
        val wallet = Wallet("Ricas", 123)
        with(wallet) {
            println(name)
            println(number)
        }

    }

    fun repeatFunction() {

        run {
            repeat(12) {
                println("imprimindo cada indice $it")
            }
        }
    }

    fun funTakeIfTakeUnless() {
        var number = 3

        val takeIf = number.takeIf {it % 2 == 0 } // retorna nulo se nao encontrar
        val takeUnless = number.takeUnless { it % 2 == 0 } // retorna o valor

        println(takeIf)
        println(takeUnless)
    }


    data class Wallet(var name: String, val number: Int)

}
