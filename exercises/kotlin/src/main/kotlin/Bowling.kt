internal class Bowling {
    var totalScore = 0

    fun scoreGame(rolls: ArrayList<Int>): Int {
        var rollIndex = 0
        for (frame in 1..10 step 1) {
            if (rolls[rollIndex] + rolls[rollIndex+1] == 10) {
                totalScore += rolls[rollIndex] + rolls[rollIndex+1] + rolls[rollIndex+2]
                rollIndex+=2
            } else if (rolls[rollIndex] == 10) {
                totalScore += rolls[rollIndex] + rolls[rollIndex+1] + rolls[rollIndex+2]
                rollIndex+=1
            }
            else {
                totalScore += rolls[rollIndex] + rolls[rollIndex+1]
                rollIndex+=2
            }
        }
        return totalScore
    }
}