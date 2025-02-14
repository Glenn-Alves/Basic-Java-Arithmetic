
import java.util.Scanner;
import Math.*;
public class JavaTest
{
    public static void main(String[] args){
        Arithmetic a = new Arithmetic();
        Scanner scan1 = new Scanner(System.in);
        
        System.out.println("Enter a first number");
        int num1 = scan1.nextInt();
        
        System.out.println("Enter a second number");
        int num2 = scan1.nextInt();
        
        int add = a.add(num1,num2);
        int subtract = a.subtract(num1,num2);
        int multiply = a.multiply(num1, num2);
        int division = a.divide(num1, num2);
        
        System.out.println("Add: " + add);
        System.out.println("Subtract: " + subtract);
        System.out.println("Multiply: " + multiply);
        System.out.println("Divison: " + division);
    }
    
}
