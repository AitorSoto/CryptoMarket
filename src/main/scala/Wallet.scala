import PaymentMethod.PaymentMethod

class Wallet (val userId : Int) {
  def buyCoin(coin: String, userId: Int, paymentMethod: PaymentMethod, amount: Double): Unit = _
}