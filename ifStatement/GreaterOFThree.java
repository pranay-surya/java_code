

// Create a program that determines the greatest of the three numbers.

package ifStatement;
import java.util.Scanner;
public class GreaterOFThree {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.println("Greater of the three numbers ");
        System.out.print("Enter the first number :: ");
        int a = input.nextInt();
        System.out.print("Enter the second number :: ");
        int b = input.nextInt();
        System.out.print("Enter the third number :: ");
        int c = input.nextInt();

        
         if (a >= b && a >= c ){
                System.out.println(+a+" number is greater");
        }   
        else if (b >= a && b >= c) {
                System.out.println(+b+" number is greater");
        } 

        else {
            System.out.println(+c+" number is greater");

        }
        
        input.close();


    }
    
}
