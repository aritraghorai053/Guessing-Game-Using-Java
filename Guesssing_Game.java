import java.util.Random;
import java.util.Scanner;

public class Guesssing_Game {
    public static void main(String[] args){
        Random r = new Random();
        Scanner s = new Scanner(System.in);

        int random_number = r.nextInt(100)+1;
        int attempt = 0;
        int guessed_number;

        System.out.println("=====Start Number Guessing Game====");
        System.out.println("You have choosen a number from 1 to 100");

        do{
            System.out.print("Guess the number:");
            guessed_number = s.nextInt();
            attempt++;
            if(guessed_number > random_number){
                System.out.println("To High! Lower Number Please.");
            }else if(guessed_number < random_number){
                System.out.println("Too Low! Higher Number Please");
            }
            else{
                System.out.println("🎉 Congratulations! You guessed the number.");
            }
        }while(guessed_number != random_number);

        System.out.println("You guessed the number in "+attempt+" guesses");

        s.close();
    }
}
