package subtask2


import kotlin.math.*

class SquareDecomposer {
    fun decomposeNumber(number: Int): Array<Int>? {
        var arr: Array<Int>?
        for (i in number - 1 downTo 1) {
            arr = (square(number)  - square(i)).getMaxMember()
            if (arr != null) return arr.plus(i)
        }
        return null
    }

    private fun Long.getMaxMember(): Array<Int>? {
        val maxMember = (sqrt(this.toDouble())).toInt()
        var arr: Array<Int>?
        for (i in maxMember downTo 1) {
            if (this - square(i) == 0L) return Array(1) { i }
            arr = (this - square(i)).getMaxMember()
            var tempResult: Long = 0
            arr?.forEach { tempResult +=square(it) }
            if (tempResult == this - square(i) && arr!=null && !arr.contains(i)) return arr.plus(i)
        }
        return null
    }
    fun square(i: Int) :Long{
        return 1L * i * i
    }
}
