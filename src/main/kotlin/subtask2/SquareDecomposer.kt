package subtask2

import kotlin.math.sqrt

class SquareDecomposer {

    fun decomposeNumber(number: Int): Array<Int>? {
        if (number > 4) {
            val numLong = number.toLong()
            val sqNumb = numLong * numLong
            val firstElemOfSequence = numLong - 1L
            val arrElemOfSequence: ArrayList<Long> = arrayListOf(firstElemOfSequence * firstElemOfSequence)

            while (sqNumb > arrElemOfSequence.sum()) {

                val elementOfSequence = arrElemOfSequence.last()
                for (i in sqrt(elementOfSequence.toDouble()).toLong() - 1 downTo 1) {
                    val tempArr = arrElemOfSequence.clone() as ArrayList<Long>
                    tempArr.add(i * i)

                    if (sqNumb >= tempArr.sum()) {
                        arrElemOfSequence.add(i * i)
                        break
                    }
                }

                if (sqNumb != arrElemOfSequence.sum() && arrElemOfSequence.last() == 1L) {
                    arrElemOfSequence.removeAt(arrElemOfSequence.lastIndex)
                    val prevnumMinusOne = sqrt(arrElemOfSequence[arrElemOfSequence.lastIndex].toDouble()).toLong() - 1L
                    arrElemOfSequence[arrElemOfSequence.lastIndex] = prevnumMinusOne * prevnumMinusOne
                }
            }

            arrElemOfSequence.reverse()
            val resultArr = Array(arrElemOfSequence.size) { 0 }
            for ((countArr, i) in arrElemOfSequence.withIndex()) {
                resultArr[countArr] = sqrt(i.toDouble()).toInt()
            }

            return resultArr

        } else {return null}
    }
}
