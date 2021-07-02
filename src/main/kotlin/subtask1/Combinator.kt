package subtask1

class Combinator {
    fun checkChooseFromArray(array: Array<Int>): Int? {
        for(i in 1..array[1]){
            if(array[0] * i.factorial() * (array[1] - i).factorial() <= array[1].factorial())
                return i
        }
        return null
    }
}
private fun Int.factorial(): Int {
    if(this == 1 || this == 0) return 1
    return (this-1).factorial() * this
}
