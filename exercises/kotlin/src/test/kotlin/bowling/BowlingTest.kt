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
        assertEquals(bowling.addScores(rolls), 0)
    }

    @Test
    fun addNone0ScoresTest(){
        val bowling = Bowling()
        val rolls = arrayListOf(1,1, 1,1, 1,1, 1,1, 1,1,
            1,1, 1,1, 1,1, 1,1, 1,1)
        assertEquals(bowling.addScores(rolls), 20)
    }

    @Test
    fun addAnyComboScoresTest(){
        val bowling = Bowling()
        val rolls = arrayListOf(1,9, 1,0, 0,7, 0,0, 2,0,
            0,0, 0,8, 0,0, 0,0, 0,1)
        assertEquals(bowling.addScores(rolls), 29)
    }
}