/* Team 9 Lives 
Christopher DeSilva, Patti Elfers Wygand, Adam Driggers, Saranii Muller*/

import java.io.*;
import java.util.*;

public class Driver{

  public static void main(String[] args) {

	Stack s = new Stack();
  //test print
  System.out.println(s); //should print [] for an empty array;
  System.out.println("is empty? " + s.isEmpty());
  System.out.println("checking the top:" + s.top()); //should return a cr
  //s.push(5);//put the value 5 at the top of the stack
  
  for(int i = 0; i < 10; i++){//creates random aray of size ten
    Random r = new Random();
    s.push(r.nextInt(10));
  }
  
  System.out.println(s);   //print out empty array
  s.push(10); // isFUll() check, just will print a error message
  System.out.println("popping last item:" + s.pop()); // should show 7
  System.out.println(s);
  System.out.println("checking the top:" + s.top());
  System.out.println();

  //pop everything, as long as there stack isn't empty, pop s
  while(s.isEmpty() == false){
    System.out.println("checking the top:" + s.top());
    System.out.println("popping last item:" + s.pop()); // should s
    System.out.println("size " + s.size());
    System.out.println();
  }
  
    System.out.println(s);

	// Queue q = new Queue();
	
  }
}