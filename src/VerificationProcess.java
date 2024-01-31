public class VerificationProcess {
    public IdCard verification(StudentInput studentInput){
        IdCard idCard = new IdCard();
        idCard.setClasss(studentInput.getClasss());
        idCard.setFullName(studentInput.getFullName());
        return idCard;
    }
}
