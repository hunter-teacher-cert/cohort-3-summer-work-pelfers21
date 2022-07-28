//Team 15 - Tree Huggers - Adam Prado, Richard Parker, Patti Elfers-Wygand

public class ExpressionTree{


    //You must write this method:
    //Calculate the value of the entire tree
    public double evaluate(){
      if(isValue()){
        return value;
      }else{
        return apply(left.evaluate(),right.evaluate(),operator);
      }

      
      //return 10000000000000.0;//replace this
    }

    //You must write this method:
    //Return a string representation of the tree
    //A value is just hte string of the value
    //An operation has parenthesis around
    //such as
    //"12.5"  //just a value
    //"(5.0-8.0)" //a tree with 2 value children
    //"(12.5*(5.0-8.0)) //a tree that is the product of the previous two example trees
    //"(((2.0+1.0)/(8.0*0.43)) - 1.0)" //a tree with more
    public String toString(){
      if(isValue()){
        return  "" + value;
      }else if(left.isValue() && right.isValue()){
         return "(" + left.value + operator + right.value + ")";
      }else{
        return "(" + left.toString() + operator + right.toString() + ")";
      }

    }
    




  private double value;
  private ExpressionTree left,right;
  private char operator;

  //Tree can be a value
  public ExpressionTree(double val){
   value = val;
   left = null;
   right = null;
  }

  //Tree can be an operator that connects two sub-trees
  public ExpressionTree(char op, ExpressionTree l, ExpressionTree r){
    operator = op;
    left = l;
    right =r;
  }

  //Return true when the node is a value, false when it is an operator
  //when the children are null, the current tree is value
  private boolean isValue(){
    return left==null && right ==null;
  }

  //Return false when the node is a value, true when it is an operator
  private boolean isOperator(){
    return !isValue();
  }

  //To simplify things, you get a method to use to convert the
  //operator and two values into a result.
  private double apply(double a, double b, char op){
   if(op == '+'){
    return a+b;
   }else if(op == '-'){
    return a-b;
   }else if(op == '*'){
    return a*b;
  }else if (op == '/'){ //or any invalid operators
    return a/b;
   }
    else{
      return Math.pow(a,b);
        }
  }
  
          
  

  /*Challenge--The way we write our mathematical operators is called infix notation. This just means the operator (+,-,* etc.) is in between the operands (numbers or variables).

When we write functions in programming languages that syntax is actually prefix notation (the operator or function name comes first).*/
    /*Prefix and postfix with math operators is used in some types of calculators and programming languages.

Remember you use prefix with method calls! If you created a method to add two values it would be used as follows:

add(10,5) is just (+ 10 5)

Similarly:

fact(10) is the same as the postfix math operator for factorial 10!*/
 public String toStringPrefix(){
      if(isValue()){
        return  "" + value;


  
      }else{
        return "(" + operator + left.toStringPrefix() +   right.toStringPrefix() + ")";
      }

    }   
  }

 