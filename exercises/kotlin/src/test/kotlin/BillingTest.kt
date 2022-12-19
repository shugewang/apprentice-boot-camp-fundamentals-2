import org.junit.jupiter.api.Test
import org.junit.jupiter.api.Assertions.*

internal class BillingTest{
    @Test
    fun generateBillForPrivateSellerTest() {
        val customer = Customer("Derek", arrayListOf(), 3, CustomerType.PRIVATE_SELLER)
        assertEquals(60, customer.generateBill())
    }

    @Test
    fun generateBillForPrivateSellerWith5AdsTest() {
        val customer = Customer("Customer1", arrayListOf(), 5, CustomerType.PRIVATE_SELLER)
        assertEquals(100, customer.generateBill())
    }

    @Test
    fun generateBillForDealerTest() {
        val customer = Customer("Really Good Dealer", arrayListOf(), 3, CustomerType.DEALER)
        assertEquals(150, customer.generateBill())
    }

    @Test
    fun generateBillForDealerWithProductsTest() {
        val customer = Customer("Super Car Market", arrayListOf("Finance", "Valuations"), 1000, CustomerType.DEALER)
        assertEquals(70000, customer.generateBill())
    }

    @Test
    fun generateBillForArthur() {
        val customer = Customer("Arthur's Cars", arrayListOf("Advert promotion"), 20, CustomerType.DEALER)
        assertEquals(1200, customer.generateBill())
    }

    @Test
    fun generateBillForSarah() {
        val customer = Customer("Sarah", arrayListOf("100 images"), 1, CustomerType.PRIVATE_SELLER)
        assertEquals(30, customer.generateBill())
    }

}