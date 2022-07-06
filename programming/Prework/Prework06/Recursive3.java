public class Recursive3{
  public static void main(String args[]){
    }
/**public static double power(double x, int n) {
    if (n == 0)
        return 1;
    if (n == 1)
        return x;
    else
        return x * (power(x, n-1));**/

public static double power(double x, int n) {
  double result = 1;
  for (int i = 0; i< n; i= i +0) {
    result = result + x;
  }
  /**if (n == 0) return 1;
  if (n == 1) return x;
  if (n == 2) return x * x;
  return power(x, n % 2) * power(power(x, n / 2), 2);**/
   
System.out.println(result);
  
}
}
