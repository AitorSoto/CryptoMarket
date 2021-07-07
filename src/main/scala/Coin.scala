class Coin(
            var coinsOnCourse: Double,
            val maxCoins: Int,
            var marketCapitalisation: Double,
            var currentValue: Double,
            val name: String,
            val shortName: String
          ) {
  def registerCoin(coin: Coin): Unit = _
}