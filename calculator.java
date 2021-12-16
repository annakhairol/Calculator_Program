import java.util.*;
import java.lang.Math;

public class calculator {

  private String operator;
  private double a,b;
  
  public calculator(){
      this.operator = "";
      this.a = 0.0;
      this.b = 0.0;
  }
  //mutator
   public void setOperator(String opType)
  {
    operator = opType;
  }
  public void setNumA(double numA)
  {
    a = numA;
  }
  public void setNumB(double numB)
  {
    b = numB;
  }
 //retriever
  public String getOperator()
  {
    return operator;
  }
  public double getNumA()
  {
    return a;
  }
  public double getNumB()
  {
    return b;
  }
  //processor
  public double normalCalc(double a, double b)
  {
      // double total = 0.0;
      if(operator.equalsIgnoreCase("+"))
        return a + b;
      else if(operator.equalsIgnoreCase("-"))
        return  a - b;
      else if(operator.equalsIgnoreCase("*"))
        return  a * b;
      else if(operator.equalsIgnoreCase("/"))
        return  a / b;
      else
          return 0;
  }

  public double advanceCalc(double a)
  {
      if(operator.equalsIgnoreCase("1"))
        return a*a;
      else if(operator.equalsIgnoreCase("2"))
        return Math.sqrt(a);
      else if(operator.equalsIgnoreCase("3"))
        return Math.sin(Math.toRadians(a));
      else if(operator.equalsIgnoreCase("4"))
        return Math.cos(Math.toRadians(a));
      else if(operator.equalsIgnoreCase("5"))
        return Math.tan(Math.toRadians(a));
      else if(operator.equalsIgnoreCase("6"))
        return Math.asin(a);
      else if(operator.equalsIgnoreCase("7"))
        return Math.acos(a);
      else if(operator.equalsIgnoreCase("8"))
        return Math.atan(a);
      else
        return 0;

  }

  public static void main(String[] args) {

    String type, operator;
    Double number1, number2;

    // create an object of Scanner class
    Scanner input = new Scanner(System.in);

        System.out.println("Would you like normal or advance calculator?");
        type = input.nextLine();
        
        if (type.equalsIgnoreCase("normal")) {

          System.out.println("Choose an operator: +, -, *, or /");
          operator = input.nextLine();

          // ask users to enter numbers
          System.out.println("Enter first number");
          number1 = input.nextDouble();

          System.out.println("Enter second number");
          number2 = input.nextDouble();
          
          calculator calc = new calculator();
          calc.setOperator(operator);
          calc.setNumA(number1);
          calc.setNumB(number2);
          System.out.println("Result: " + calc.getNumA() + " " + calc.getOperator() + " " +
           calc.getNumB() + " = " + calc.normalCalc(number1,number2));
        }

        else if (type.equalsIgnoreCase("advance")) {

          System.out.println("Enter the number of an operator: ");
          System.out.println("1)Square 2)SquareRoot 3)Sine 4 )Cosine 5)Tangent 6)Arc Sine 7)Arc Cosine 8)Arc Tangent ");
          operator = input.nextLine();

          // ask users to enter numbers
          System.out.println("Enter a number");
          number1 = input.nextDouble();

          calculator calc = new calculator();
          calc.setOperator(operator);
          calc.setNumA(number1);
          
          System.out.println("Result: " + calc.advanceCalc(number1));

        }   
   input.close();
    }
}

