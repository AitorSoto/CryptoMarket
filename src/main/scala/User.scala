import PaymentMethod.PaymentMethod

class User (
             val userId : Int,
             val name : String,
             val email : String,
             val password : String,
             val paymentMethod: PaymentMethod,
             val wallet: Wallet
           ) {
  def queryCoinValue(name: String): Double = 0.0
  def queryAllCoinValues(): List[Coin] = List(new Coin(
    0.0,
    1000,
    12,
    4.6,
    "TrollCoin",
    "TC"
  ))
  def registerUser(name: String, email: String, password: String): Unit = _
}