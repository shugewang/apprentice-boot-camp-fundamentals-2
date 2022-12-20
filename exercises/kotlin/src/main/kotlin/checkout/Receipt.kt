package checkout

class Receipt {
    private var text = ""
    private var numberOfA = 0
    private var total = 0
    private var numberOfB = 0
    private var numberOfC = 0
    private var numberOfD = 0
    fun text(): String {
        return text + "Total: " + total
    }


    private fun updateDiscountReceipt(discount: Int, quantity: Int, discountedTotal: Int) {
        text += " - $discount ($quantity for $discountedTotal)"
    }

    fun scannedA() {
        text += "A: 50"
        if (++numberOfA % 5 == 0) {
            updateDiscountReceipt(30, 5, 220)
            total += 20
        } else {
            total += 50
        }
        text += "\n"
    }

    fun scannedB() {
        text += "B: 30"
        if (++numberOfB % 2 == 0) {
            updateDiscountReceipt(15, 2, 45)
            total += 15
        } else {
            total += 30
        }
        text += "\n"
    }

    fun scannedC() {
        text += "C: 20"
        if (++numberOfC % 4 == 0) {
            updateDiscountReceipt(10, 4, 70)
            total += 10
        } else {
            total += 20
        }
        text += "\n"

    }

    fun scannedD() {
        text += "D: 15"
        if (++numberOfD % 5 == 0) {
            updateDiscountReceipt(15, 5, 60)
            total += 0
        } else {
            total += 15
        }
        text += "\n"
    }
}
