// Create a program to calculate Compound Interest 
//         Compount Interest = P(1+R/100)^t

package operators;
import java.util.Scanner;

public class CompoundInterest {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.println("Compound Interest ::");
        System.out.print("Enter value of Principle Amount::");
        int p = input.nextInt();
        System.out.print("Enter Value of Rate  ::");
        float r = input.nextFloat();
        System.out.print("Enter Time Period (year) ::");
        float t = input.nextFloat();

        double compoundInterest = p * Math.pow((1+r/100),t);
        System.out.println("Total Amount is ::"+compoundInterest);
        System.out.println("Compound Interest is ::"+(compoundInterest-p));



    }
    
}
