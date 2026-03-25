
//  Create a program that determines is number is odd or even
package ifStatement;
import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.println("Determining number is even or odd");
        System.out.print("Enter the number :: ");
        int a = input.nextInt();

        if (a % 2 == 0){
            System.out.println("Number is even");
        }
        else{
            System.out.println("Number is odd");
        }
    }
    
}
