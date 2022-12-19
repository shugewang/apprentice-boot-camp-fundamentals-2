internal class Bowling {
    fun addRolls(rolls: ArrayList<Int>): Int {
        var totalScore = 0
        val frames = rolls.chunked(2)
        for (i in frames.indices) {
            if (frames[i].sum() == 10) {
                totalScore += frames[i+1][0]
            }
            totalScore += frames[i].sum()
        }
        return totalScore
    }
}