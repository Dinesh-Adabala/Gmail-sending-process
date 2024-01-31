package MarksCompersion;

public class StudentMain {
   public static void main(String[]args){
        StudentService studentService = new StudentService();
        StudentMarks studentMarks = new StudentMarks();
        studentMarks.englishMarks= 65;
        studentMarks.mathMarks= 56;
        String result =studentService.compersion(studentMarks);
       System.out.println(result);
    }



}
