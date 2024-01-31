package Gmail;

public class MailLoginProcess {
    public Boolean loginProcess(FromAccountDetails fromAccountDetails){
        String fromGmailId = "dinesh.adabala417@gmail.com";
        String fromPassword = "1419@adS";
        if (fromGmailId == fromAccountDetails.emailId && fromPassword == fromAccountDetails.password ){
            return true;
        }
        else {
            return false;
        }
    }
}
