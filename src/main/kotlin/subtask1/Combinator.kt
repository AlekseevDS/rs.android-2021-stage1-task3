package subtask1

class Combinator {

    fun checkChooseFromArray(array: Array<Int>): Int? {
        var xForReturn: Int? = null

        for (i in 1..array[1]) {
            val binom = factorial(array[1])/(factorial(array[1] - i) * factorial(i))
            if (binom >= array[0]) {
                xForReturn = i
                break
            }
        }
        return xForReturn
    }

    private fun factorial(num: Int): Long {
        var result:Long = 1L
        for (i in 1..num) {
            result *= i
        }
        return result
    }
}
