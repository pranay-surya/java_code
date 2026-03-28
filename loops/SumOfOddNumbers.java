

// Create a program to sum all odd numbers from 1 to a specified number N. 

package loops;
import java.util.Scanner;
public class SumOfOddNumbers {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.println("Sum of odd numbers ");
        System.out.print("Enter the number to which want to add odd numbers :: ");
        int n = input.nextInt();

        int i = 1;
        int odd_total = 0;
        while (i <= n) {
            if ( i % 2 != 0) {
                odd_total = odd_total + i;
             }
            i++;       
        }
        System.out.print("Sum of odd numbers from range 1 to "+n+ " is "+odd_total);
        input.close();



    }
    
}
