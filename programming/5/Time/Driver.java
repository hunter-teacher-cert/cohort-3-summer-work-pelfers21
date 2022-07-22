 import java.io.*;
import java.util.*;


/**
 * Time class by Team LucidThinkeren
 
 * collaborators: Patti Elfers-Wygand, Adam Prado, Parmanand Mohanlall
 */

/**
   INSTRUCTIONS:
   This file contains the Driver starter code for our Time class.
   
   Add code in main to test all your methods
   
   Place this file in a folder named programming/5/Driver.java
*/


public class Driver {

    public static void main(String[] args) {

	//declare a var of appropriate type to assign an instance of Time to
	    Time t;
      Time z;
      Time a;
	//assign var the address of a newly-apportioned Time object
	t = new Time();
      System.out.println(t.toString());
      z = new Time(5, 7, 8);
      System.out.println(z.toString());

    z.set(1,2,3);
     System.out.println(z.toString());  

      t.set(5,5,5);
      z.add(t);
      System.out.println(z.toString());  

      System.out.println(z.equals(t));
      
      a = new Time(6, 7, 8);
      System.out.println(z.equals(a));
      z.set(1,2,3);
       a.compareTo(z);
      
        
    }//end main()

}//end class 