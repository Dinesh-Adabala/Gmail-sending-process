public class StudentInput {
    String fullName;
    String fatherName;
    String motherName;
    String classs;
    String mobileNumber;
    String gender;

    public StudentInput(String fullName, String fatherName, String motherName, String classs, String mobileNumber, String gender) {
        this.fullName = fullName;
        this.fatherName = fatherName;
        this.motherName = motherName;
        this.classs = classs;
        this.mobileNumber = mobileNumber;
        this.gender = gender;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getFatherName() {
        return fatherName;
    }

    public void setFatherName(String fatherName) {
        this.fatherName = fatherName;
    }

    public String getMotherName() {
        return motherName;
    }

    public void setMotherName(String motherName) {
        this.motherName = motherName;
    }

    public String getClasss() {
        return classs;
    }

    public void setClasss(String classs) {
        this.classs = classs;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}
