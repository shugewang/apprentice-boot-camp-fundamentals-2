package checkout

internal class Checkout {
    private var total = 0
    private var numberOfA = 0
    private var numberOfB = 0
    private var numberOfC = 0
    private var numberOfD = 0
    private val receipt: Receipt = Receipt()
    fun scan(sku: String) {
        if ("A" == sku) {
            total += 50
            if (++numberOfA % 5 == 0) {
                total -= 30
            }
            receipt.scannedA()
        } else if ("B" == sku) {
            total += 30
            if (++numberOfB % 2 == 0) {
                total -= 15
            }
            receipt.scannedB()
        } else if ("C" == sku) {
            total += 20
            if (++numberOfC % 4 == 0) {
                total -= 10
            }
            receipt.scannedC()
        } else if ("D" == sku) {
            total += 15
            if (++numberOfD % 5 == 0) {
                total -= 15
            }
            receipt.scannedD()
        }
    }

    fun total(): Int {
        return total
    }

    fun receipt(): String {
        return receipt.text()
    }
}
