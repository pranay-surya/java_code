


// Create a program that compute the sum of the digits of an integer.

package loops;
import java.util.Scanner;
public class SumOfDigit {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.println("Sum of digits");
        System.out.print("Enter the minimum of 2 digit of integer number :: ");
        int n = input.nextInt();

        int sumOfDigit = 0;
        while (n > 0) {
            sumOfDigit += n % 10 ;
            n /= 10;

        }
        System.out.print("Sum of digits of an integer is "+ sumOfDigit);
        input.close();


    

    }
    
}
