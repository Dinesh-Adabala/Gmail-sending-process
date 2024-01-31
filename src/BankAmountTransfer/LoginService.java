package BankAmountTransfer;

public class LoginService {
   public boolean login(CardDetails cardDetails) {
        String cardNo = "1234 1234 1234";
        String pinNo = "1234";
        if (cardNo.equals(cardDetails.cardNumber) && pinNo.equals(cardDetails.pinNumber)) {
            return true;
        } else {
            return false;


        }
    }
}
