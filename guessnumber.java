import java.util.Scanner;
import java.util.InputMismatchException;
import java.util.Random;
public class guessnumber {
    public static void main(String[] args) {
        int score = 100;
        
        try (Scanner input = new Scanner(System.in)) {
            Random RNG = new Random();
            int guess = RNG.nextInt(100);
            int number;
            boolean iscorrect = false;
            

            while (!iscorrect) {
                IO.print("Enter guess number 1-100 :");
                number = input.nextInt();
                if(number==guess){
                    iscorrect = true;
                }
                if(number>guess){
                    IO.println("too much");
                    score--;
                }
                if(number<guess){
                    IO.println("add more");
                    score--;
                }
                }
                System.out.printf("NICE, Your Score is %d",score);
                } catch (InputMismatchException e) {
                    IO.println("must be number");
                }
        
    }
}
