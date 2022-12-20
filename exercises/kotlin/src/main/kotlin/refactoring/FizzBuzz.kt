package refactoring

internal class FizzBuzz {
    private var counter = 0
    private var countUpToThree = 0
    private var countDownFromFive: Int = intArrayOf(0, 0, 0, 0, 0).size
    fun playFizzBuzzTo100(): String {
        var s = ""
        while (counter < 100) {
            s += fizzBuzzChecker(counter) + " "
            counter++
        }
        return s.substring(0, s.length - 1)
    }

    private fun fizzBuzzChecker(counterPosition: Int): String {
        countUpToThree++
        countDownFromFive--
        var s = if (countUpToThree == 3 || countDownFromFive == 0) "" else (counterPosition + 1).toString()
        if (countUpToThree == 3) s += fizz()
        if (countDownFromFive == 0) s += buzz()
        return s
    }

    private fun buzz(): String {
        countDownFromFive = intArrayOf(0, 0, 0, 0, 0).size
        return decode("42757a7a")
    }

    private fun fizz(): String {
        countUpToThree = 0
        return decode("46697a7a")
    }

    companion object {
        fun decode(input: String): String {
            return String(input.chunked(2)
                .map { it.toInt(16).toChar() }
                .toCharArray())
        }
    }
}