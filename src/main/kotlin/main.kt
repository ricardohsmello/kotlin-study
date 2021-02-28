import examples.GuideToArrays
import examples.GuideToNullSafety
import examples.GuideToConditions
import java.math.BigDecimal

fun main() {

//    guideToNullSafety()
//    guideToConditions()
    guideToArrays()


}



fun guideToArrays() {
    val array = GuideToArrays()
    val intNumbers = intArrayOf(5, 8, 2, 8, 7, 10, 0)
    val doubleNumbers = doubleArrayOf(2.0,5.0,6.0,5.0)
    array.isAllElementsIsGreatestThan9(intNumbers)
    array.isAnyElementsIsGreatestThan9(intNumbers)
    array.filterElementsGreatestThan9(intNumbers)
    array.findElementsGreatestThan9(intNumbers)
    array.whatIsTheAverageNumber(intNumbers)
    array.whatIsTheGreatestNumberUsingMaxOrNull(intNumbers)
    array.whatIsTheGreatestNumber(intNumbers)
    array.whatIsTheLowestNumber(intNumbers)
    array.multiplyEachIndexOfArrayBy2(doubleNumbers)
    array.sumEachIndexOfArrayBy2(intNumbers)
    array.rangeTo(firstElement = 1, lastElement = 10)
    array.printWithTwoInterval()
    array.printUntil(10)
    array.downTo(1)
    array.arrayOfBigDecimal("123.3", "32.3", "231")
    array.sumBigDecimalUsingReduceAccumulator(Array<BigDecimal>(2) { "100.0".toBigDecimal(); "100.0".toBigDecimal()})
    array.increase100or50()
}

fun guideToNullSafety() {
    GuideToNullSafety()
}

fun guideToConditions() {

    var conditions = GuideToConditions()
    conditions.whatIsTheGreatestNumberUsingWhen(4,4)

    println(conditions.whatIsTheGreatestNumberUsingIf(33, 15, 8))

}

