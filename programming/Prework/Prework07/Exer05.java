import java.util.Scanner;

public class Exer05 {


    /*method to find prime numbers between 0 and n*/
    public static boolean[] sieve(int n){

        boolean[] booleanArray=new boolean[n];    /*creates a new boolean array*/

        for(int i=0;i<n;i++){         /*makes all elements of array as 'true'*/

            booleanArray[i]=true;

        }

        for(int i=2;i*i<n;i++){

            if(booleanArray[i]==true){    /*if the element is not marked false*/

                for(int j=i*i;j<n;j+=i){      /*marks all multiples of i as false*/

                    booleanArray[j]=false;

                }
            }
        }

        return booleanArray;    /*returns the boolean array*/
    }

    
    public static void main(String[] args){

        System.out.println("Enter a number: ");    /*asks user to enter a number*/

        Scanner scanner=new Scanner(System.in);    /*creates a new Scanner object*/

        int number=scanner.nextInt();    /*takes number from user*/

        System.out.println("The prime numbers from 0 to "+(number-1)+" are: ");

        boolean[] booleanArray=sieve(number);    /*calls sieve method that returns boolean array*/

        for(int i=2;i<number;i++){   /*runs loop from 2 to number-1*/

            if(booleanArray[i]==true){     /*if the number is prime*/
                System.out.print(i+" ");     /*print the number*/
            }
        }
    }
}
