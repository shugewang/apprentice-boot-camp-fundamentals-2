class Customer (val name: String, val products: ArrayList<String>, val numberOfAdverts: Int, val customerType: CustomerType) {
    fun generateBill(): Int {
        var bill = 0
        if (customerType == CustomerType.PRIVATE_SELLER) {
            bill = numberOfAdverts * 20 + generateBillForProducts()
        } else if (customerType == CustomerType.DEALER) {
            bill = numberOfAdverts * 50 + generateBillForProducts()
        }
        return bill
    }

    fun generateBillForProducts(): Int {
        return 10*products.size*numberOfAdverts
    }
}

enum class CustomerType {
    DEALER,
    PRIVATE_SELLER
}
