package refactoring

internal class FizzBuzz {
    private val ONE_HUNDRED = Byte.MAX_VALUE - 27
    private val FIVE = intArrayOf(0, 0, 0, 0, 0).size
    private val FIZZ = decode("46697a7a")
    private val BUZZ = decode("42757a7a")

    private var counter = 0
    private var countUpToThree = 0
    private var countDownFromFive: Int = FIVE

    fun playFizzBuzz(): String {
        var result = ""
        while (counter < ONE_HUNDRED) {
            result += fizzBuzzChecker(counter) + " "
            counter++
        }
        return result.substring(0, result.length - 1)
    }

    private fun fizzBuzzChecker(counterIndex: Int): String {
        countUpToThree++
        countDownFromFive--
        val isFizz = countUpToThree == 3
        val isBuzz = countDownFromFive == 0
        val counterAsString = (counterIndex + 1).toString()
        var result = if (isFizz || isBuzz) "" else counterAsString
        if (isFizz) result += fizz()
        if (isBuzz) result += buzz()
        return result
    }

    private fun buzz(): String {
        resetBuzzCounter()
        return BUZZ
    }

    private fun resetBuzzCounter() {
        countDownFromFive = FIVE
    }

    private fun fizz(): String {
        resetFizzCounter()
        return FIZZ
    }

    private fun resetFizzCounter() {
        countUpToThree = 0
    }

    companion object {
        fun decode(input: String): String {
            return String(input.chunked(2)
                .map { it.toInt(16).toChar() }
                .toCharArray())
        }
    }
}