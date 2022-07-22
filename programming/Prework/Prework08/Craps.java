

//Craps.java

import java.util.Scanner;
import java.util.Random;
class Craps
{
   //function roll that takes a n as the number of dice to roll
   public static Random rand = new Random();
   public static int roll(int n)
   {
       int sum = 0;
       for(int i = 0;i< n;i++)
       {
           //generate a random number of range 1 - 6 (both inclusive)
           //here rand.nextInt(6) generates numbers between the range 0(inclusive) to 6(exclusive)
           //that's why 1 is added
           sum += (rand.nextInt(6) + 1);
       }
       return sum;
   }
   public static int validate(int sum)
   {
       if(sum == 6 || sum == 12 || sum == 13 || sum == 17 || sum == 19 || sum == 23)
       {
           return 1;
       }
       else if(sum == 9 || sum == 11 || sum == 18 || sum == 24)
       {
           return 0;
       }
       else
       {
           return sum;
       }
   }
   public static void main(String args[])
   {
       String name;
       int choice;
       Scanner in = new Scanner(System.in);
      
       System.out.println("- - - - Welcome to the club - - - - - ");
       System.out.print("Please Enter Your Name : ");
       name = in.nextLine();
      
       System.out.println("Hello! "+name+" Here is the description of the game\n");
       System.out.println("You will have 4 dice which is treated as 1 set and you will be have the first chance to throw it");
       System.out.println("If you get 6,12,13,17,19,23 you will win");
       System.out.println("If you get 9,11,18,24 you will loss");
       System.out.println("If you get other than those, then whatever you get will be your goal");
       System.out.println("That means you have to throw the dice again to get the first time value you get");
       System.out.println("You lose if you get 23 while throwing for the goal\n\n");
      
       int wins = 0, losses = 0,goal = 0,value;
      
       int res;
       boolean new_game = true;
       choice = 1;
       while(choice != 0)
       {
          
           value = roll(4);
          
           if(new_game)
           {
               System.out.println("Your First Throw in New Game : "+value);
               res = validate(value);
               if(res == 1)
               {
                   System.out.println("Congrats, You Win");
                   wins++;
               }
               else if(res == 0)
               {
                   System.out.println("Sorry , You Lose");
                   losses++;
               }
               else
               {
                   goal = value;
                   System.out.println("Your New Goal is set . You have to throw "+goal +" to win");
                   new_game = false;
               }
           }
           else
           {
               System.out.println("Your Throw : "+value);
               if(value == goal)
               {
                   System.out.println("Congrats, You Win");
                   wins++;
                   new_game = true;
               }
               else if(value == 23)
               {
                   System.out.println("Sorry, You Lose. You have thrown 23");
                   losses ++;
                   new_game = true;
               }
               else
               {
                   System.out.println("wrong Throw You should throw "+goal+" to win");
               }
           }
           System.out.print("\nEnter 0.Exit\t1.Continue Playing: ");
           choice = in.nextInt();
           System.out.println();
       }
       System.out.println("Hello! Player: "+name+ " Your game statistics are below\n");
       System.out.println("Number of Wins: "+wins);
       System.out.println("Number of Losses: "+losses);
   }
}