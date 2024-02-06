
import java.util.Scanner;

public class Calculator {
   // Build Calculator class with public methods and private fields listed above
   private double value;

   /* The Math operation for the simple Calculator class Starting with adding, followed by 
    subtracting, then mulitplying, and finally dividing. The Clear*/  
    public void Calculator(){
        // Set the initial value to 0.0
        this.value = 0.0;
        
    }
    public void add(double val){
       // Adds to the initial value, val
        value += val;
    }

    public void subtract(double val){
        // Subtracts from the initial value, val
        value -= val;
        
    }

    public void multiply(double val){
        // Multiplies to the initial value, val
        value *= val;
        
    }

    public void divide(double val){
        // Divides from the initial value, val
        value /= val;
        
    }

    public void clear(){
        //Resets the initial value
        value = 0.0;
    }

    public double getValue(){
        return value;
    }
   
   public static void main(String[] args) {
    System.out.println("Welcome to the basic calculator. Before we begain I will need two different numbers to show you everything I can do. " + "----------------------------------------------------------------------\n\n");

    Calculator calc = new Calculator();
    Scanner keyboard = new Scanner(System.in);

    System.out.println("The first number is: ");
    double num1 = keyboard.nextDouble();
    
    System.out.println("The second number is: ");
    double num2 = keyboard.nextDouble();
    keyboard.close();
    
    // 1. The initial value
    System.out.println(calc.getValue()); 
    
    // 2. The value after adding num1
    calc.add(num1);
    System.out.println(calc.getValue());
    
    // 3. The value after multiplying by 3
    calc.multiply(3);
    System.out.println(calc.getValue());
    
    // 4. The value after subtracting num2
    calc.subtract(num2);
    System.out.println(calc.getValue());
    
    // 5. The value after dividing by 2
    calc.divide(2);
    System.out.println(calc.getValue());
    
    // 6. The value after calling the clear() method
    calc.clear();
    System.out.println(calc.getValue()); 
    
   }
}