package Gmail;

public class MailSendingProcess {
    String message="pop";
    public String sendingProess( String toEmail,String typeMsg){
       // String localEmailId = "dinesh.adabala417@gamil.com";
        ToAccountDetails tad = new ToAccountDetails();
        MailLoginProcess mlp = new MailLoginProcess();
        FromAccountDetails fad = new FromAccountDetails();
        boolean mLoginStatus = mlp.loginProcess(fad);
        if (mLoginStatus){
            message =  typeMsg;
            tad.inbox=message;
            System.out.println("message Recived :" + tad.inbox);
        }

        return message;
    }
}
