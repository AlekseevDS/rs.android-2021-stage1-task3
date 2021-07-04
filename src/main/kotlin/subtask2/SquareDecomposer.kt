package subtask2

import kotlin.math.sqrt

class SquareDecomposer {

    // TODO: Complete the following function
    fun decomposeNumber(number: Int): Array<Int>? {
        throw NotImplementedError("Not implemented")
        val sqNum = number * number
        var elemOfSequence = 0
        var arrElemOfSequence: ArrayList<Int>
        val firstElemOfSequence = number - 1
        arrElemOfSequence.add(firstElemOfSequence * firstElemOfSequence)
        val tempOfposition = 0

        while (sqNum > arrElemOfSequence.sum()) {
            var ostatok = sqNum - arrElemOfSequence.sum()
            elemOfSequence = sqrt(ostatok.toDouble()).toInt()
            arrElemOfSequence.add(elemOfSequence * elemOfSequence)
        }


    }
}
