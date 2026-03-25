// Create a program to calculate Perimeter of triangle 
//  Perimeter of Triangle ABCD = A + B + C + D 

package operators;
import java.util.Scanner;

public class PerimeterOfRectangle {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Perimeter of Rectangle ABCD ::");
        System.out.println("Enter Value of A of Retangle ABCD ::");
        double a = input.nextDouble();
        System.out.println("Enter Value of B of Rectangle ABCD ::");
        double b = input.nextDouble();
        System.out.println("Enter Value of A of Rectangle ABCD ::");
        double c = input.nextDouble();
        System.out.println("Enter Value of A of Rectangle ABCD ::");
        double d = input.nextDouble();

        double periOfRectangle = a+b+c+d;
        System.out.println("Perimeter of Rectangle ABCD is :: "+periOfRectangle);

    }
    
}
