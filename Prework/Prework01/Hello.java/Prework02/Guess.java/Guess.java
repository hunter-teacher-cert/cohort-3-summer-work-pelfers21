import java.util.Scanner;
import java.util.Random;
public class Guess{

    public static void main(String[] args) {

        int random, guess;
        Scanner keyboard = new Scanner(System.in);
        Random generator = new Random();
        random = generator.nextInt(100) + 1;
         

        System.out.print("I am thinking of a number between 0 and 100, what do you think it is?");

        guess = keyboard.nextInt(); 
        

        System.out.println(random + " " + "is the correct answer!" + " ");
        System.out.println(guess - random + " "  +"is the difference between the two numbers!");

    }        
}