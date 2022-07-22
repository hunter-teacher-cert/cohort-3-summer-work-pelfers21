class Time{
 
   public static void main(String[] args) {
       String firstLine = "Time Warp!";
       System.out.println(firstLine);
 
     // Exercise 3 part #2 Current Time
       int hour = 8;
       int minute = 50;
       int second = 25;
       
       System.out.print("The current time is ");
       System.out.print(hour);
       System.out.print(":");
       System.out.print(minute);
       System.out.println(".");
 
       //Exercise 3 Part 3
 
       System.out.print("Number of seconds since midnight: ");
       System.out.println((hour * 60 * 60) + (minute * 60) + second);
 
     //Exercise 3 part 4
       System.out.print("Seconds remaining in the day: ");
       System.out.println((24 * 60 * 60) -  ((hour * 60 * 60) + (minute * 60) + second));
     //Exercise 3 Part 5
       System.out.print("Percent of the day that has passed: ");
       System.out.println(((hour * 60 * 60) + (minute * 60) + second) * 100/ (24 * 60 * 60));
 
     // Exercise 3 Part 5 - Elapsed time
     // original time was 08:55:25
       System.out.print("Elapsed time: ");
       System.out.println((hour * 60 + minute) - (8 * 60 + 50) ); 
      }
}