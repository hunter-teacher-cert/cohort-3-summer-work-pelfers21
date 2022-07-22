public class Node{
  private String data;
  private Node next;

  /* Constructors */

  public Node(){
    
  }

  public Node(String data){ 
    this.data = data; 
    this.next = null; 
  }

  public Node(String data, Node next){ 
    this.data = data; 
    this.next = next; 
  }

  public String getData(){ 
    return data; 
  }
  public Node getNext(){  
    return next; 
  }

  public void setData(String data){
    this.data = data;
  }

  public void setNext(Node next){
    this.next = next;
  }

  public String toString(){
    return "" + data + "->";
  }
}

/*main
Node n1 = new Node(5);      //line 7      --> Creates Node n1 and then...
                              lines 11-13 --> within Node n1, the String "5" is assigned to data; the Node (null) is assigned to next



Node n2 = new Node(10);     //line 7      --> Creates Node n2 and then...
                              lines 11-13 --> within Node n2, the String "10" is assigned to data; the Node (null) is assigned to next



n1.setNext(n2);             //lines 32-33 --> creates a pointer that 
                                              within Node n1, reassign (null) to next 



n2.setNext(new Node(15));   //lines 32-33 --> 
                                              



n2 = new Node(20);
Node n3 = new Node(25,n2);

  */