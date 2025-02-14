package Math;


public class Arithmetic
{
   public int add(int num1, int num2){
       int total = num1 + num2;
       return total;
   }
   
    public int subtract(int num1, int num2){
       int total = num1 - num2;
       return total;
   }
   
    public int multiply(int num1, int num2){
       int total = num1 * num2;
       return total;
   }
   
   
    public int divide(int num1, int num2){
        if(num2 ==0){
            System.out.println("cannot divide by zero");
            return 0;
        }
        int total = num1 / num2;
        return total;
    }
 
}
