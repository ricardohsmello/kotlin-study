package examples

import java.math.BigDecimal
import java.math.RoundingMode

class GuideToArrays {

    constructor() {
        println("Using array")
    }

    fun whatIsTheGreatestNumber(numbers: IntArray) {
        println("### whatIsTheGreatestNumber ###")

        var greatest = 0
        for (number in numbers) {
            if (number > greatest)
                greatest = number
        }

        result(greatest)
    }

    fun whatIsTheLowestNumber(numbers: IntArray) {
        println("### whatIsTheLowestNumber ###")
        var lowest = Int.MAX_VALUE
        numbers.forEach { number ->
            if (number < lowest)
                lowest = number
        }

        result(lowest)
    }

    private fun result(value: Any) {
        println("Result is: $value")
    }

    fun multiplyEachIndexOfArrayBy2(numbers: DoubleArray) {
        println("### Multiply each index of array by 2 ###")
        val increase = 2.0

        for (number in numbers.indices) {
            numbers[number] = numbers[number] * increase
        }

        result(numbers.contentToString())
    }

    fun sumEachIndexOfArrayBy2(numbers: IntArray) {
        println("### Sum each index of array by 2 ###")
        val increase = 2

        numbers.forEachIndexed() { i, number ->
            numbers[i] = number + increase
        }

        result(numbers.contentToString())
    }

    fun rangeTo(firstElement: Int, lastElement: Int) {
        println("### RangeTo ###")
        val rangeTo = firstElement.rangeTo(lastElement)

        for (n in rangeTo)
            print("$n, ")

        println()
    }

    fun printWithTwoInterval() {
        println("### Print with two interval ###")
        val intProgression = 0..30 step 2

        for (n in intProgression)
            print("$n, ")

        println()
    }

    fun printUntil(lastNumber: Int) {
        println("### Print until $lastNumber ###")
        for (i in 0.until(lastNumber)) {
            print(i)
        }
        println()
    }

    fun downTo(value: Int) {
        println("### Print downTo $value ###")
        for (i1 in 10.downTo(value)) {
            print(value)
        }

        println()
    }

    fun whatIsTheGreatestNumberUsingMaxOrNull(intNumbers: IntArray) {
        println("### whatIsTheGreatestNumberUsingMaxOrNull ###")
        println(intNumbers.maxOrNull())
    }

    fun whatIsTheAverageNumber(intNumbers: IntArray) {
        println("### whatIsTheAverageNumber ###")
        println(intNumbers.average())
    }

    fun isAllElementsIsGreatestThan9(intNumbers: IntArray) {
        println("### isAllElementsIsGreatestThan100 ###")
        println(intNumbers.all {
            it > 9
        })
    }

    fun isAnyElementsIsGreatestThan9(intNumbers: IntArray) {
        println("### isAnyElementsIsGreatestThan9 ###")
        println(intNumbers.any {
            it > 9
        })
    }

    fun filterElementsGreatestThan9(intNumbers: IntArray) {
        println("### filterElementsGreatestThan9 ###")
        println(intNumbers.filter {
            it > 9
        })
    }

    fun findElementsGreatestThan9(intNumbers: IntArray) {
        println("### findElementsGreatestThan9 ###")
        println(intNumbers.find {
            it > 9
        })
    }

    fun arrayOfBigDecimal(vararg valores: String) {
        println("### arrayOfBigDecimal ###")

        val array = Array<BigDecimal>(valores.size) { i ->
            valores[i].toBigDecimal()
        }

        result(array.contentToString())
    }

    fun increase100or50() {
        println("### increase100or50 ###")

        val array = Array(1) { "120.00".toBigDecimal(); "20.00".toBigDecimal() }
        val result: Array<BigDecimal> = array
            .map { value ->

            when ( value < "100".toBigDecimal()) {
                true ->  (value + "50".toBigDecimal().setScale(2, RoundingMode.UP))
                else -> (value + "100".toBigDecimal().setScale(2, RoundingMode.UP))
            }

            }.toTypedArray()

    }

    fun sumBigDecimalUsingReduceAccumulator(array: Array<BigDecimal>) {
        println("### sumBigDecimalUsingReduceAccumulator ###")

        val reduceAccumulator = array.reduceAccumulator()
        print(reduceAccumulator)
    }

 

   fun Array<BigDecimal>.reduceAccumulator() : BigDecimal {
        return this.reduce { acc, bigDecimal ->
            acc + bigDecimal
        }
    }
}