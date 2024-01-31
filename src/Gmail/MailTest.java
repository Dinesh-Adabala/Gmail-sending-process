package Gmail;

public class MailTest {
    public static void main(String[]args){
        MailLoginProcess mlp = new MailLoginProcess();
        //ToAccountDetails tad = new ToAccountDetails();
        MailSendingProcess msp = new MailSendingProcess();
        FromAccountDetails fad = new FromAccountDetails();
        //fad.emailId="dinesh.adabala417@gmail.com";
        //fad.password = "1419@adS";
        boolean logInStatus = mlp.loginProcess(fad);
        if (logInStatus){
            String massage = msp.sendingProess("dinesh.adabala222@gmail.com","Hai Hello Dinesh Adabala");
            System.out.println(massage);

        }
    }
}
