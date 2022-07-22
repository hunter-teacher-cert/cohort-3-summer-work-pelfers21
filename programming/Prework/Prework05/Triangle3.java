import java.util.*;
public class Triangle3 {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int a,b,c;
        System.out.println("Enter the lengths of sides a,b,c:");
        a=sc.nextInt();                                            //read a,b,c values from user
        b=sc.nextInt();
        c=sc.nextInt();
        if(a<=0 || b<=0 ||c<=0)              //checking values less than or equal to 0 and printing error message
        {
            System.out.println("ERROR:lengths should not be less than or equal to zero");
        }
        else if(a<=b+c && b<=a+c && c<=a+b)       //conditions for forming a traingle
        {
            System.out.println("You can form a triangle");
        }
        else
        {
            System.out.println("You cannot form a triangle");
        }
    }
}