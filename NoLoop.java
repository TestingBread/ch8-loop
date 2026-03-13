public class NoLoop {
public static void main(String[] args) {
    // IO.println("hello ");
    // IO.println("hello ");
    // IO.println("hello ");
    // IO.println("hello ");
    // IO.println("hello ");

int sum = 0;
    for (int i=0;i<=100;i++){
        if (i%2 ==0) {
            IO.println("this one "+i);
            sum = sum+i;
        }
    }
    IO.println("Sum is : "+sum);
}}