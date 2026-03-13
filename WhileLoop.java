import java.util.Scanner;

public class WhileLoop {
    public void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int age = -1;

        while(age < 0 || age > 150) {
            System.out.printf("ใส่อายุ :");
            age = input.nextInt();
            
        }
        input.close();
        IO.println("อายุ :"+age);
    }
}
