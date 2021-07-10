package subtask3

class TelephoneFinder {

    fun findAllNumbersFromGivenNumber(number: String): Array<String>? {
        var arrResult: MutableList<String>? = mutableListOf()

        if (number.toInt() >= 0) {
            val arrChar = number.toCharArray()

            for ((i, digit) in arrChar.withIndex()) {
                val tempArr = arrChar.clone()
                when (digit) {
                    '0' -> {
                        tempArr[i] = '8'
                        arrResult?.add(String(tempArr))
                    }
                    '1' -> {
                        tempArr[i] = '2'
                        arrResult?.add(String(tempArr))
                        tempArr[i] = '4'
                        arrResult?.add(String(tempArr))
                    }
                    '2' -> {
                        tempArr[i] = '1'
                        arrResult?.add(String(tempArr))
                        tempArr[i] = '5'
                        arrResult?.add(String(tempArr))
                        tempArr[i] = '3'
                        arrResult?.add(String(tempArr))
                    }
                    '3' -> {
                        tempArr[i] = '2'
                        arrResult?.add(String(tempArr))
                        tempArr[i] = '6'
                        arrResult?.add(String(tempArr))
                    }
                    '4' -> {
                        tempArr[i] = '1'
                        arrResult?.add(String(tempArr))
                        tempArr[i] = '5'
                        arrResult?.add(String(tempArr))
                        tempArr[i] = '7'
                        arrResult?.add(String(tempArr))
                    }
                    '5' -> {
                        tempArr[i] = '2'
                        arrResult?.add(String(tempArr))
                        tempArr[i] = '4'
                        arrResult?.add(String(tempArr))
                        tempArr[i] = '6'
                        arrResult?.add(String(tempArr))
                        tempArr[i] = '8'
                        arrResult?.add(String(tempArr))
                    }
                    '6' -> {
                        tempArr[i] = '5'
                        arrResult?.add(String(tempArr))
                        tempArr[i] = '3'
                        arrResult?.add(String(tempArr))
                        tempArr[i] = '9'
                        arrResult?.add(String(tempArr))
                    }
                    '7' -> {
                        tempArr[i] = '4'
                        arrResult?.add(String(tempArr))
                        tempArr[i] = '8'
                        arrResult?.add(String(tempArr))
                    }
                    '8' -> {
                        tempArr[i] = '5'
                        arrResult?.add(String(tempArr))
                        tempArr[i] = '7'
                        arrResult?.add(String(tempArr))
                        tempArr[i] = '9'
                        arrResult?.add(String(tempArr))
                        tempArr[i] = '0'
                        arrResult?.add(String(tempArr))
                    }
                    '9' -> {
                        tempArr[i] = '8'
                        arrResult?.add(String(tempArr))
                        tempArr[i] = '6'
                        arrResult?.add(String(tempArr))
                    }
                }
            }
        } else arrResult = null

        return arrResult?.toTypedArray()
/*        if (arrResult != null) {
            return arrResult.toArray() as Array<String>?
        } else return null*/

    }

}
