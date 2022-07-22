
//Parmanand Mohanlall
//Patti Elfers-Wygand

public class Fence
{

  /**
     String fenceR(int) -- recursive fence generator
     precond:  input is a positive integer
     postcond: returns fence with n posts
     eg
     fenceR(1) -> "|"
     fenceR(2) -> "|--|"
  */
  public static String fenceR( int n )
  {
    //we have to start at zero or else stack overflow with a 1
    if(n == 0) {return "";
    }
    else if (n==1){
      return   "|";   
    }
    else { return fenceR(n-1) + "--|";
    }
    
    /* YOUR SIMPLE, SMART IMPLEMENTATION HERE */
  }
  
  

  public static void main( String[] args )
  {

    for( int i = 0; i < 10; i++ ) {
      System.out.println( i + "-post fences: " );
      System.out.println( fenceR(i) );
      //can change the 1o to any number.
    }

    /* feel free to add extra tests... */

  }
}