public class Test {
    public static void main (String[]args){
        VerificationProcess vp = new VerificationProcess();
        StudentInput studentInput = new StudentInput("Manoj K","Raghu K","Gowri K", "8","802389329", "M");
        IdCard id = vp.verification(studentInput);
        System.out.println(id);
        System.out.println(id.fullName);
        System.out.println(id.classs);
        System.out.println(id.rollNumber);
        System.out.println(id.schoolName);
        System.out.println(id.section);

    }

}
