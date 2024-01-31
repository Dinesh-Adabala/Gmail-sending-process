package BankAmountTransfer;

public class TestProcess {
    public static void main(String[] args) {
        LoginService ls = new LoginService();
        CardDetails cd = new CardDetails();
        CreditService2 cs2 = new CreditService2();
        cd.cardNumber = "1234 1234 1234";
        cd.pinNumber = "1234";
        boolean loginStatus = ls.login(cd);
        if (loginStatus){
            int balance = cs2.credit("1234 1234 1234",99);
            System.out.println(balance);
        }

    }
}
