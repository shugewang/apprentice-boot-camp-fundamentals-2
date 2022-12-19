package bowling

import Bowling
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test


internal class BowlingTest {
    val bowling = Bowling()

    @Test
    fun addAll0ScoresTest(){
        val rolls = arrayListOf(0,0, 0,0, 0,0, 0,0, 0,0,
            0,0, 0,0, 0,0, 0,0, 0,0)
        assertEquals(0, bowling.scoreGame(rolls))
    }

    @Test
    fun addNone0ScoresTest(){
        val rolls = arrayListOf(1,1, 1,1, 1,1, 1,1, 1,1,
            1,1, 1,1, 1,1, 1,1, 1,1)
        assertEquals(20, bowling.scoreGame(rolls))
    }

    @Test
    fun addAnyComboScoresTest(){
        val rolls = arrayListOf(1,8, 1,0, 0,7, 0,0, 2,0,
            0,0, 0,8, 0,0, 0,0, 0,1)
        assertEquals(28, bowling.scoreGame(rolls))
    }

    @Test
    fun addScoresWithSingleSpareTest(){
        val rolls = arrayListOf(5,5, 1,0, 0,0, 0,0, 0,0,
            0,0, 0,0, 0,0, 0,0, 0,0)
        assertEquals(12,bowling.scoreGame(rolls))
    }

    @Test
    fun addScoresWithMultipleSpareTest(){
        val rolls = arrayListOf(5,5, 1,9, 0,0, 3,7, 2,0,
            0,0, 0,0, 0,0, 0,0, 0,0)
        assertEquals(35, bowling.scoreGame(rolls))
    }

    @Test
    fun addScoresWithSingleStrikeTest(){
        val rolls = arrayListOf(10, 1,1, 0,0, 0,0, 0,0,
            0,0, 0,0, 0,0, 0,0, 0,0)
        assertEquals(14, bowling.scoreGame(rolls))
    }

    @Test
    fun addScoresWithMixedSparesAndStrikesTest(){
        val rolls = arrayListOf(10, 1,1, 4,6, 10, 2,3,
            0,0, 0,0, 0,0, 0,0, 0,0)
        assertEquals(54, bowling.scoreGame(rolls))
    }

    @Test
    fun allStrikesTest() {
        val rolls = arrayListOf(10, 10, 10, 10, 10,
            10, 10, 10, 10, 10, 10, 10)
        assertEquals(300, bowling.scoreGame(rolls))
    }

    @Test
    fun nineStrikesAndASpare() {
        val rolls = arrayListOf(10, 10, 10, 10, 10,
            10, 10, 10, 10, 5, 5, 10)
        assertEquals(275, bowling.scoreGame(rolls))
    }

    fun allSpares() {
        val rolls = arrayListOf(5,5, 5,5, 5,5, 5,5, 5,5, 5,5,
            5,5, 5,5, 5,5, 5,5, 5,5, 5,5, 5)
        assertEquals(150, bowling.scoreGame(rolls))
    }
}