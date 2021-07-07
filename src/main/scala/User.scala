import PaymentMethod.PaymentMethod

class User (val userId : Int, val name : String, val email : String, val password : String, val paymentMethod: PaymentMethod, val wallet: Wallet){

}