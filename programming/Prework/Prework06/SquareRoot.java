public class SquareRoot {
    public static void main(String args[]){
        System.out.println(squareRoot(192.0));
    }

    public static double squareRoot(double a){

        double g = a/2; //guess
        double i = (g + (a/g))/2; //better guess

        double i1 = (i + (a/i))/2; //even better  guess, i1

        while (Math.abs((i-i1)) > 0.0001){  //with i and i1,  entering the loop
            i = (i1 + (a/i1))/2;
            i1 = (i + (a/i))/2;  //i1 has to be less then i
          
        }
     return i1;
      }
        
    
}