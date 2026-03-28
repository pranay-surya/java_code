

// Create a program that calculate the Factorial of a given number.

package loops;
import java.util.Scanner;
public class Factorial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Factorial of a given number");
        System.out.print("Enter a numbers to calculate Factorial :: ");
        int n = input.nextInt();

        int i  = 1;
        int factorial = 1;
        while (i <= n) {
            factorial *= i;
            i++;

        }
        System.out.println("Factorial of a "+n+" is "+factorial);
        input.close();




        
    }
}
