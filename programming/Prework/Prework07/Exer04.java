public class Exer04
{
  
public static int indexOfMax(int[] a)

{

// stoe the index of maximum element

int index = -1;

// store the maximum value in the array

int max = Integer.MIN_VALUE;

int i;

for( i = 0 ; i < a.length ; i++ )

{

// if current element is greater the maximum element till now

if( a[i] > max )

{

max = a[i];

index = i;

}

}

return index;

}

public static void main(String[] args)

{

int[] arr = { 2 , 5 , 3 , 6 , -1};

int index = indexOfMax( arr );

System.out.println("Index of Maximum Element : " + index);

}

}