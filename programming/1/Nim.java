import java.io.*;
import java.util.*;
public class Nim {
  public static void main (String [] arg){
    int stones = 12;
      int stonesTaken;

    Scanner input = new Scanner(System.in);
System.out.println("Let's play Nim!"+ "This version you have 12 stones to begin and the last player to take a stone wins!" +
 "You may choose 1-3 stones to remove.");
   //loop until game ends
			while(stones > 0) {
				//prompt user input
				System.out.println("There are " + stones + " stones in the pile.  How many would you like to take? You may take 1, 2, or 3 stones");
				stonesTaken = input.nextInt();
					//calculate number of stones remaining, print
				stones = stones - stonesTaken;
				System.out.println("You took " + stonesTaken+ ". There are now " + stones + " stones left in the pile. ");
					//check for win
				if (stones == 0)
					{
					System.out.println("You took the last stone! You are the winner!");
            break;
					}
					//machine turn
				else {
					if (stones > 3){
						Random random = new Random();
        		stonesTaken = random.nextInt(3)+1;
				
					}else{
						stonesTaken = 3;
					}
				
				//calculate number of stones remaining, print
				stones = stones - stonesTaken;
				System.out.println("The machine took " + stonesTaken + " stones. There are now " + stones + " stones left in the pile. "  );
					//check win
				if (stones == 0)
					{
					System.out.println("The machine took the last stone! You lost!");
           
					}
					
				}
				
			}
			
		}
		
	}