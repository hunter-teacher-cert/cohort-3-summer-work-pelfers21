/*if x=[0,1,2,3] then barGraphify(x) will output
0:
1: =
2: ==
3: ===

if x=[1,0,3,2] then barGraphify(x) will output
0: =
1:
2: ===
3: ==
  YOUR BREAKOUT MISSION: Pair-program this function
* Coding car stuck? Proud of a breakthrough and want to share? "Wave your team flag" by posting :alert: to this channel.
* Use KtS liberally. If possible, note pedagogical aspects.*/
public class Main {

  
  public static void main(String[] args) {
    System.out.println("Hello world!");
   String [] numstest = {"5"};
    
    System.out.println(numstest[0]);

    int [] nums = { 5, 4, 3};
      for (int i=0; i<nums.length; i++){
          System.out.print("=");
    }
      
  }

   // public static void barGraphify(int [] nums) {   
      
   //   for (int i=0; i<nums.length; i++){
   //     return "=";
       
   //   }
   // }
    
    //int bar = new barGraphify(nums);
  
}