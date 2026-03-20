import java.util.Scanner;
import java.util.InputMismatchException;
import java.util.Random;
public class GuessNumUPD {
    public static void main(String[] args) {
        int score = 100;
        
        try (Scanner input = new Scanner(System.in)) {
            Random RNG = new Random();
            int guess = RNG.nextInt(100);
            int number,count = 0;
            final int remind_guess = 5;
            boolean is_gameover = false;
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
                count++;
                if(count == remind_guess){
                    IO.println("Game Over");
                    is_gameover = true;
                    break;
                }
                }
                if (is_gameover == false) {
                    System.out.printf("NICE, Your Score is %d",score);
                }
                
                } catch (InputMismatchException e) {
                    IO.println("must be number");
                }
        
    }
}
