
// Create a program that prints the multiplication table for a given number


package loops;
import java.util.Scanner;
public class MultiplicationTable {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.println("Multiplication table of a given number");
        System.out.print("Enter the number for Multiplication table :: ");
        int n = input.nextInt();
        int i = 1;
        while (i <= 10){
            System.out.println(n*i);
            i++;
        }

        input.close();


    }
    
}
