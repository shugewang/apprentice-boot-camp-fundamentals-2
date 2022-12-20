package checkout

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class CheckoutTest {
    @Test
    fun oneA() {
        val checkout = Checkout()
        checkout.scan("A")
        assertEquals(checkout.total(), 50)
    }

    @Test
    fun twoA() {
        val checkout = Checkout()
        checkout.scan("A")
        checkout.scan("A")
        assertEquals(checkout.total(), 100)
    }

    @Test
    fun threeA() {
        val checkout = Checkout()
        checkout.scan("A")
        checkout.scan("A")
        checkout.scan("A")
        assertEquals(checkout.total(), 150)
    }


    @Test
    fun sixA() {
        val checkout = Checkout()
        checkout.scan("A")
        checkout.scan("A")
        checkout.scan("A")
        checkout.scan("A")
        checkout.scan("A")
        checkout.scan("A")
        assertEquals(checkout.total(), 270)
    }

    @Test
    fun oneB() {
        val checkout = Checkout()
        checkout.scan("B")
        assertEquals(checkout.total(), 30)
    }

    @Test
    fun twoB() {
        val checkout = Checkout()
        checkout.scan("B")
        checkout.scan("B")
        assertEquals(checkout.total(), 45)
    }

    @Test
    fun fourB() {
        val checkout = Checkout()
        checkout.scan("B")
        checkout.scan("B")
        checkout.scan("B")
        checkout.scan("B")
        assertEquals(checkout.total(), 90)
    }

    @Test
    fun fourC() {
        val checkout = Checkout()
        checkout.scan("C")
        checkout.scan("C")
        checkout.scan("C")
        checkout.scan("C")
        assertEquals(checkout.total(), 70)
    }

    @Test
    fun fiveD() {
        val checkout = Checkout()
        checkout.scan("D")
        checkout.scan("D")
        checkout.scan("D")
        checkout.scan("D")
        assertEquals(checkout.total(), 60)
    }

    @Test
    fun simple() {
        val checkout = Checkout()
        checkout.scan("A")
        assertEquals(checkout.total(), 50)
        checkout.scan("B")
        assertEquals(checkout.total(), 80)
        checkout.scan("C")
        assertEquals(checkout.total(), 100)
        checkout.scan("D")
        assertEquals(checkout.total(), 115)
    }

    @Test
    fun incremental() {
        val checkout = Checkout()
        checkout.scan("A")
        assertEquals(checkout.total(),50)
        checkout.scan("B")
        assertEquals(checkout.total(),80)
        checkout.scan("A")
        assertEquals(checkout.total(),130)
        checkout.scan("A")
        assertEquals(checkout.total(),180)
        checkout.scan("B")
        assertEquals(checkout.total(),195)
        checkout.scan("C")
        assertEquals(checkout.total(),215)
        checkout.scan("B")
        assertEquals(checkout.total(),245)
        checkout.scan("C")
        assertEquals(checkout.total(),265)
        checkout.scan("D")
        assertEquals(checkout.total(),280)
        checkout.scan("D")
        assertEquals(checkout.total(),295)
        checkout.scan("D")
        assertEquals(checkout.total(),310)
        checkout.scan("C")
        assertEquals(checkout.total(),330)
    }
}