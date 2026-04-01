

//  Create a program to check if number is a palindrome

package loops;
import java.util.Scanner;
public class Palindrome {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.println("palindrome checking ");
        System.out.print("Enter the number :: ");
        int n = input.nextInt();
        int original  = n;

        int reverse  = 0 ;
        while (n > 0 ) {
            int digit = n % 10;
            reverse  = reverse  * 10 + digit;
            n /= 10;  
        }

        if (original  == reverse ) System.err.println("Number is palindrome");
        else System.err.println("Number is not a palindrome");

        input.close();

    }
    
}
