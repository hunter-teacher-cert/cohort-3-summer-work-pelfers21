
  import java.io.*;
import java.util.*;

/*
Multiplayer: Patti Elfers, Alana Robinson, Suesann, Erwin
Sort Project:
Part 1:  (BASIC)
  1. Analyze the two constructors - try to figure out how they work.
  2. Compile and run the program (SortProjectDriver.java and SortProject.java) and confirm
  the behavior of the constructors.
  Part 2: (BASIC)
  1. Read the description of findSmallestIndex and complete the method.
  2. Uncomment the lines in SortProjectDriver to test.
  Part 3: (INTERMEDIATE)
  1. Complete the sort method - read comments for description
  2. Uncomment the lines in sortProjectDriver to test.
Search Project:
  1. Complete the linear search (BASIC)
  2. Complete the binary search (Intermediate)
  3. Complete the recursive version of binary search (Advanced)
*/

public class SortSearch{

    /* Sort project starts here */
    
    /* Instance Variables */
  private ArrayList<Integer> data;  // to store the data
    
  private Random r; 

    //both ()SortSearch methods are similar 
  public SortSearch()
  {
	  data = new ArrayList<Integer>();// this is the data constructor
	  r = new Random();// this is creating a new random  variable
	  for (int i=0;i<15;i++)
    {// this will only work if you have 14 numbers 
	    data.add(r.nextInt(20));
	  }
	
  }
    
  public SortSearch(int size)
  {//this method will work  if you don't know the size
	  data = new ArrayList<Integer>();
	  r = new Random();
	  for (int i=0;i<size;i++)
    {
	    data.add(r.nextInt(20));
	  }
	
  }

    /* Convenience function to get data out of the ArrayList from the driver */
  public int get(int index)
  {
	  return this.data.get(index);
    }
    


    /*
      return the index of the smallest data item from index start to the end
      of the ArrayList. If there are multiple of the smallest value,
      return any of them.
      
      Example, if the arraylist has:
      5,3,10,6,8
      if start was 2 (start at index 2, value 10) then it would return 3
      which is the index of the value 6 which is the index with the
      smallest value from start to end
      On the otherh and, if start was 0, then the method would
      return 1 since the value 3 is in index 1 and that is the smallest.
      
          */
  public int findSmallestIndex(int start)
  {
	  int smallIndex = start;
      //given an index, want smallest number in array list starting from this index
      //create a temporary variable for smallest number = first index(value)
      //traverse the list with for loop
      //check if less than current number
      //at end of list will return smallestNumber
      //*int smallestNumber = data.get(start);//Because start is the starting index to search from, we want to set the corresponding value to be our starting smallest number
      
    for(int i = start; i < data.size(); i++) //Because we've already dealt with data[start] in line 78, we want to start searching through the array past that, so smallIndex = start + 1, and this for loop will go from that to the end of the array
      {
        if (data.get(i) < data.get(smallIndex)) // If the current value we're looking at with the for loop is less than our current smallestNumber, enter this statement
        {
          //*smallestNumber = data.get(i); //reassign smallestNumber to new smallest number
          smallIndex = i; //reassign index of smallest number to new index of smallest number
        }
      
    
      
    }
      return smallIndex;//dummy return
    }
    //int smallIndex;//returning the smallest value's location
      //int temp = 0;
    
   
    
    public void sort(){
     //int smallIndex;//returning the smallest value's 
      
      for (int i = 0; i < data.size(); i++){
        //variable of the index of the smallest element
        int smallestIndex = findSmallestIndex(i);
        //create an int temp and set value of the smallest             element
        
        int temp = data.get(smallestIndex);
        //
        int smalls = data.get(i);
        //set data set to i and temp and then set smallest 
        data.set(i, temp);
        data.set(smallestIndex, smalls);
      }


    }



    /* Search project starts here */
    
    /**
       performs a linear search. Returns the index of the first occurence of
       value in the ArrayList data or -1 if not found.
       This works by starting at the first element and searching one element at a time 
       until either the element is found or you've looked at all the elements.
       This algorithm works on any ArrayList.
    */
    public int linearSearch(int value)
    {
      int foundIndex = -1;//this returns a -1 if not found
  
    for (int i = 0; i < data.size(); i++) 
    {
      int element = data.get(i);
      if (element == value) 
      {
        foundIndex = i;
        break;
      }
    }
    return foundIndex;
    }
    
	 
    


    
    /**
       Implement a binary search as specified by the comments
       
       This algorithm only works on sorted ArrayLists.
    */
    public int binarySearch(int value){
      int low = 0;
      int high = data.size() -1;
      int middle = (high + low) /2;
      
	// while we're not done:
      while (true)
      {
        if (data.get(middle) == value)
        {
          return middle;
        }
        else if (value < data.get(middle)){
          high = middle-1;
        }
        else if (high <= low){
            return -1;
        }
        else {
          low = middle + 1;
        }
        middle = (low + high)/2;
      }
    }
  
	// create assign variables  representing the high, low and middle indices 
      
	// while we're not done:
	//   if the item is at data.get(middle), return middle
	//   otherwise, update high, low, and middle

	
	    

    
    /**
       Implement a RECURSIVE binary search as specified by the comments
       
       This algorithm only works on sorted ArrayLists.
    */

    //public int binarySearchRecursive(int value, int lowIndex, int highIndex){

	// refer to class discussion
	
	//return 0;
	    
    //}
    
	
    public String toString(){
	    return ""+data;
    }


    public void builtinSort(){
	Collections.sort(data);
	
    }
    

    

  /* Merge Sort Stuff after here */
    /**
       Builds and returns an ArrayList that's already in increasing order.
       You can use this method to test your merge method.
    */
    public ArrayList<Integer> buildIncreasingList(int size){
	ArrayList<Integer>  newlist = new ArrayList<Integer>();
	Random r = new Random();
	int nextval = r.nextInt(20)+1;
	for (int i=0;i<size;i++){
	    newlist.add(nextval);
	    nextval = nextval + r.nextInt(20);
	}

	return newlist;
	}

    /**
       this routine should create and return a new ArrayList of
       integers and fill it by merging list1 and list2 into the new
       list.
       list1 and list2 are already sorted in increasing order.
       Example:
       If list1 contains [1,5,17,25]
       and list2 contains [3,6,10,30,40,50]
       The new list will contain:
       [1, 3, 5, 6, 10, 17, 25, 30, 40, 50]
       
    */

    public ArrayList<Integer> merge(ArrayList<Integer> list1,
				    ArrayList<Integer> list2){
      ArrayList<Integer> output = new ArrayList<Integer>();
      while(list1.size() > 0 && list2.size() > 0){
        if(list1.get(0) < list2.get(0))    {
        output.add(list1.get(0));
          list1.remove(0);
        }else{
         output.add(list2.get(0));
          list2.remove(0); 
        }//ends else statement
        
      } //ends while loop - true until list one is empty
      while(list1.size() > 0)  {
        output.add(list1.get(0));
        list1.remove(0);
      }//true until list two is empty
      while (list2.size() > 0) {
      output.add(list2.get(0));
        list2.remove(0);
      }
    return output;
	// code for merge

	//return new ArrayList<Integer>(); // replace this line
}
  
  public ArrayList<Integer> mergeSort(ArrayList<Integer> list){

      if (list.size() < 2){
        return list;
      }
    ArrayList<Integer> leftList = new ArrayList<Integer>();
    ArrayList<Integer> rightList= new ArrayList<Integer>();
      
    for(int i = 0; i<list.size()/2; i++){
      leftList.add(list.get(i));
      
      
      
    }
    for (int j = list.size()/2;                   j<list.size(); j++){
      rightList.add(list.get(j));
    }
    //System.out.println(leftList);
    //System.out.println(rightList);
  leftList = mergeSort(leftList);
  rightList = mergeSort(rightList);
    
    
    
    
    
    
    return merge (leftList, rightList);
    
    
    
        
      
    
      // if not the base case
      // split in two lists
      // meregSort the left half
      // mergeSort the right half
      // merge them together into a new list
      // return that new list 

  }


  public void msort(){
      data =  mergeSort(data);
  }
//public class SortSearchReferenceDriver{
  
//}


}//end of class