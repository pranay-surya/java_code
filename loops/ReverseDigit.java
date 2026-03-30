
//  Create a program to Reverse the digit of a number.


package loops;
import java.util.Scanner;
public class ReverseDigit {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Reverse the digit of a number");
        System.out.print("Enter the number want to reverse ::");
        int a = input.nextInt();

        int newNum = 0;
        while (a > 0) {
            int digit = a % 10;
            newNum = newNum * 10 + digit;
            a /= 10;
            
        }
        System.out.println("Reverse the digit of a number is "+newNum);
        input.close();




    }
    
}
