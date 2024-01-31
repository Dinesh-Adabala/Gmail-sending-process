package MarksCompersion;

public class StudentService {
    String compersion(StudentMarks studentMarks){
        int passMarks = 35;
        if (passMarks <= (studentMarks.englishMarks) && passMarks <= (studentMarks.mathMarks)){
            return "Student Passed All Subjects";
        }
        else {
            return "Student Failed";
        }
    }
}
