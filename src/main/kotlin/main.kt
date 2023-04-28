fun main() {
    val minCommission = 35
    val commissionPercentage = 0.075f
    val amount = 10_000

    val payComission = if (amount * commissionPercentage > minCommission) amount * commissionPercentage else minCommission
    println("Необходимо заплатить комиссию за первод: $payComission рублей")
}