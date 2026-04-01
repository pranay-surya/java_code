


// Create a program to check if a number is an Armstrong number.

/* An Armstrong number (also called a narcissistic number) is a number 
that is equal to the sum of its own digits raised to the power of the number of digits.

Example 1: 153
Digits: 1, 5, 3 → total digits = 3
Calculation:
1³ + 5³ + 3³  
= 1 + 125 + 27  
= 153

Example 2: 9474
Digits: 9, 4, 7, 4 → total digits = 4
Calculation:
9⁴ + 4⁴ + 7⁴ + 4⁴  
= 6561 + 256 + 2401 + 256  
= 9474

Example (Not Armstrong): 123
1³ + 2³ + 3³ = 1 + 8 + 27 = 36 ≠ 123

*/
package loops;
import java.util.Scanner;
public class Armstrongnumber {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Checking Armstrong number ");
        System.out.print("Enter the number :: ");
        int n = input.nextInt();

        int original = n;
        int sum = 0 , count = 0;

        //  count the number of digit
        int temp = n;
        while (temp > 0) {
            count++;
            temp /= 10;
        }

        // power and sum 
        temp = n;
        while (temp > 0) {
            int digit = temp % 10;
            sum += Math.pow(digit,count);
            temp /= 10;

        }

        if (original == sum ) System.out.println("Number is a Armstrong number ");
        else System.out.println("Number is not a Armstrong number ");

        input.close();

    }
    
}
