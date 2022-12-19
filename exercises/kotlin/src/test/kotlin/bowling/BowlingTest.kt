package bowling

import Bowling
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class BowlingTest {
    @Test
    fun addAll0ScoresTest(){
        val bowling = Bowling()
        val rolls = arrayListOf(0,0, 0,0, 0,0, 0,0, 0,0,
            0,0, 0,0, 0,0, 0,0, 0,0)
        assertEquals(bowling.addRolls(rolls), 0)
    }

    @Test
    fun addNone0ScoresTest(){
        val bowling = Bowling()
        val rolls = arrayListOf(1,1, 1,1, 1,1, 1,1, 1,1,
            1,1, 1,1, 1,1, 1,1, 1,1)
        assertEquals(bowling.addRolls(rolls), 20)
    }

    @Test
    fun addAnyComboScoresTest(){
        val bowling = Bowling()
        val rolls = arrayListOf(1,8, 1,0, 0,7, 0,0, 2,0,
            0,0, 0,8, 0,0, 0,0, 0,1)
        assertEquals(bowling.addRolls(rolls), 28)
    }

    @Test
    fun addScoresWithSingleSpareTest(){
        val bowling = Bowling()
        val rolls = arrayListOf(5,5, 1,0, 0,0, 0,0, 0,0,
            0,0, 0,0, 0,0, 0,0, 0,0)
        assertEquals(bowling.addRolls(rolls), 12)
    }

    @Test
    fun addScoresWithMultipleSpareTest(){
        val bowling = Bowling()
        val rolls = arrayListOf(5,5, 1,9, 0,0, 3,7, 2,0,
            0,0, 0,0, 0,0, 0,0, 0,0)
        assertEquals(bowling.addRolls(rolls), 35)
    }

    @Test
    fun addScoresWithSingleStrikeTest(){
        val bowling = Bowling()
        val rolls = arrayListOf(10, 1,1, 0,0, 0,0, 0,0,
            0,0, 0,0, 0,0, 0,0, 0,0)
        assertEquals(bowling.addRolls(rolls), 14)
    }
}