// Program that takes two numbers and shows results of all arithmetic operators

package operators;
import java.util.*;

public class Arithmetic {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the two numbers: ");
        int a = input.nextInt();
        int b = input.nextInt();

        // Arithmetic operations
        System.out.println("Addition: " + (a + b));
        System.out.println("Subtraction: " + (a - b));
        System.out.println("Multiplication: " + (a * b));    
        System.out.println("Division: " + (a / b));
        System.out.println("Float Division: " + ((double)(a/b)));
        System.out.println("Modulus: " + (a % b));
     
    }
}