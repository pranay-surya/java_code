
// Create a program that determine if a number is positive, negative or zero

package ifStatement;
import java.util.Scanner;

public class PositiveAndNegative {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.println("Checking number is positive, negative, or zero");
        System.out.print("Enter the number :: ");
        int a = input.nextInt();
        if (a>0){
            System.out.println("Number is positive");
        }
        else if (a==0){
            System.out.println("Number is zero");
        }
        else{
            System.out.println("Number is Negative");
        }
    }
    
}
