import java.util.Scanner;

public class workshop_number {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int count, sum = 0, evenCount, Usrinput, MIN_VALUE = 0, MAX_VALUE = 10000;
        IO.print("Enter any number to plus :");
        Usrinput = input.nextInt();
        

            while (Usrinput != -1) {
                IO.print("Enter another number? no -1:");
                sum = Usrinput + sum;
                Usrinput = 0;
                Usrinput = input.nextInt();
            }
        
            IO.println("summary of ur input is :"+sum);

    }
}
