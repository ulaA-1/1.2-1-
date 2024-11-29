fun main() {
    var amount = 20_000
    val commission = 0.0075
    val minCommision = 35
    val size = commission * amount

    val finalCommission = if (size < minCommision) minCommision else size

    println("Комиссия: $finalCommission рублей")
}