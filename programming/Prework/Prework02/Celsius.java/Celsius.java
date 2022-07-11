import java.util.Scanner;

public class Celsius {
	public static void main(String[] args) {
		// Create new Scanner object
		Scanner input = new Scanner(System.in);

		// Prompt user to input a double
		System.out.print("Enter a degree in Celsius: ");
		double celsius = input.nextDouble();

		// Convert Celsius to Fahrenheit
		double fahrenheit = 9.0 / 5 * celsius + 32;
    //double tempInFarenheight = (double)tempInCelsius * ((double) 9/5) + 32;
    //input.nextLine();-good to use - doesn't read the return character.  this does
		// Display results
		System.out.println(celsius + " Celsius is " + fahrenheit
			+ " Fahrenheit"); 
    //System.out.printf( + C =%.1f", tempInFarenheit);
    //System.out.print(" F");
	}
}