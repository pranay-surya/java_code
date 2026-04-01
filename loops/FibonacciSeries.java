

// Create a program to print the Fibonacci Series up to a certain number.

package loops;
import java.util.Scanner;
public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Printing Fibonacci Series");
        System.out.print("Enter the number to which Fibonacci series print :: ");
        int n = input.nextInt();
        int a = 0, b = 1;
 
        while (a <= n) {
            System.out.print(a + " ");
            int next = a + b;
            a = b;
            b = next;      
        
        }
        input.close();


        

    }
    
}
