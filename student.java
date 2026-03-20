public class student {
    private int studentID;
    private String studentName;
    private double studentGPA;

    public student(int studentID, String studentName, double studentGPA) {
        this.studentID = studentID;
        this.studentName = studentName;
        this.studentGPA = studentGPA;
    }



    public void displayinfo() {
    IO.println("student info");
    IO.println("student ID "+this.studentID);
    IO.println("student name "+this.studentName);
    IO.println("student GPA "+this.studentGPA);
}
public String getInfo(){
    return this.studentID+" "+this.studentName+" "+this.studentGPA;
}
}