

public class studentTest {
    public static void main(String[] args) {
        student s1 = new student(20, "bread", 3.33);
        student s2 = new student(50, "wawa", 3.66);
        s1.displayinfo();
        
        IO.println(s2.getInfo());
    }
}
