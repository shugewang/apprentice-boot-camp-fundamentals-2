class Customer (val name: String, val products: ArrayList<String>, val numberOfAdverts: Int, val customerType: CustomerType) {
    fun generateBill(): Int {
        var bill = 0
        if (customerType == CustomerType.PRIVATE_SELLER) {
            bill = numberOfAdverts * (20 + 10*products.size)
        } else if (customerType == CustomerType.DEALER) {
            bill = numberOfAdverts * (50+10*products.size)
        }
        return bill
    }
}

enum class CustomerType {
    DEALER,
    PRIVATE_SELLER
}
