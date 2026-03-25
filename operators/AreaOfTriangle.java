//  Create a program to calculate Area of Triangle 
//  Area of Triangle = 1/2*B*H

package operators;
import java.util.Scanner;

public class AreaOfTriangle {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Area of Triangle ABC ::");
        System.out.print("Enter Height of Triangle ABC :: ");
        double h = input.nextDouble();
        System.out.print("Enter Breadth of Triangle ABC :: ");
        double b = input.nextDouble();

        double areaOfTriangle = (b*h)/2;
        System.out.println("Area of Triangle ABC is ::"+areaOfTriangle);






        

    }
    
}
