import java.util.Scanner;

public class calcu {
    public static void main(String[] args) {

            Scanner input = new Scanner(System.in);
            int num1,num2,choice;
            choice = 0;
            
            
            do {
                System.out.printf("บวกกด 1\nลบกด 2\nคูณกด 3\n0 to Exit\nEnter 0-3 :");
                choice = input.nextInt();
                if (choice==1)
                {
                    IO.print("Enter num1 :");
                    num1 = input.nextInt();
                    IO.print("Enter num2 :");
                    num2 = input.nextInt();
                    System.out.printf("==========result is = %d==========\n", (num1+num2));
                    choice = 0;
                }
                if (choice==2)
                {
                    IO.print("Enter num1 :");
                    num1 = input.nextInt();
                    IO.print("Enter num2 :");
                    num2 = input.nextInt();
                    System.out.printf("==========result is = %d==========\n", (num1-num2));
                    choice = 0;
                }
                if (choice==3)
                {
                    IO.print("Enter num1 :");
                    num1 = input.nextInt();
                    IO.print("Enter num2 :");
                    num2 = input.nextInt();
                    System.out.printf("========== result is = %d ==========\n", (num1*num2));
                    choice = 0;
                }
                
        }while(choice != 0);
    }
}

