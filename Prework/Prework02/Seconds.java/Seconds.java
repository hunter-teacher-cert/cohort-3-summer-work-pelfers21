import java.util.*;
 class Seconds {
 public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Input seconds: ");
		    int seconds = in.nextInt(); 
        int sec = seconds % 60;
        int hours = seconds / 60;
        int min = hours % 60;
        hours = hours / 60;
        System.out.print(hours + ":" + min + ":" + sec);
		System.out.print("\n");
    }    
 }