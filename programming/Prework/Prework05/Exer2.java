import java.util.*;

class Exer2 {

public static void main(String[] args) {

System.out.println("n=30 m=5 : Divisible= "+isDivisible(30,5)); // giving input to isDivisible as n=30 m=5 to test the working

System.out.println("n=30 m=6 : Divisible="+isDivisible(30,6));// giving input to isDivisible as n=30 m=6 to test the working

System.out.println("n=30 m=7 : Divisible="+isDivisible(30,7));// giving input to isDivisible as n=30 m=6 to test the working

}

public static boolean isDivisible(int n,int m){ // function defination start here

if(n%m==0) // if n is divisible by m it will return true

return true;

else //if n is not divisible by m it returns false

return false;

}

}