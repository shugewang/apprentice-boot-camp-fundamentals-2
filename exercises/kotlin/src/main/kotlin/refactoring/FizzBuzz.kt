package refactoring

internal class FizzBuzz {
    private var counter = 0
    private var countUpToThree = 0
    private var countDownFromFive: Int = intArrayOf(0, 0, 0, 0, 0).size
    fun playFizzBuzzTo100(): String {
        var result = ""
        while (counter < 100) {
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