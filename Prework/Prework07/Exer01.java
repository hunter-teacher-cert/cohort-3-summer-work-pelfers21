public class Exer01 {
public static int[] powArray(int a[]){
    int newArray[] = new int[a.length];
    for(int i = 0;i<a.length;i++){
        newArray[i] = a[i] * a[i];
    }
    return newArray;
}
  public static void main(String[] args){}

public static int[] powArray(int a[], int n){
    int newArray[] = new int[a.length];
    for(int i = 0;i<a.length;i++){
        newArray[i] = (int) Math.pow(a[i],n);
    }
    return newArray;
}

public static int[] histogram(int a[]){
    int hist[] = new int[100];
    for(int i = 0;i<hist.length;i++){
        hist[i] = 0;
    }
    for(int i = 0;i<a.length;i++){
        hist[a[i]]++;
    }
    return hist;
}

public static int histogram(int a[], int counter){
    int res = 0;
    for(int i = 0;i<a.length;i++){
        if(counter == a[i]){
            res += 1;
        }
    }
    return res;
}
//Yes, we can rewrite like below.. It is an enhanced for loop.
/*for (int value : values) {
    System.out.println(value);
}*/
}  
