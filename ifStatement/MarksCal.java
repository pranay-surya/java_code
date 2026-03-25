
// Create a program that calculate grades based on marks
// A - above 90 % 
// B - above 75 %
// C - above 60 %
// D - above 40 %
// Fail 


package ifStatement;
import java.util.Scanner;
public class MarksCal {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.println("Grade portal");
        System.out.print("Enter marks of maths ::");
        double math = input.nextDouble();

        System.out.print("Enter marks of science ::");
        double sci = input.nextDouble();

        System.out.print("Enter marks of english ::");
        double eng = input.nextDouble();

        System.out.print("Enter marks of history ::");
        double his = input.nextDouble();

        System.out.print("Enter marks of game ::");
        double game = input.nextDouble();
        double total = math+eng+his+game+sci;
        double grades = ( total / 500 ) * 100;
        
        System.out.println("Percentage are " +grades+"%");

        if (grades > 90 ) System.out.print("Grade is A ");
        else if (grades > 75 ) System.out.print("Grade is B ");
        else if (grades > 60 ) System.out.print("Grade is C ");
        else if (grades > 40 ) System.out.print("Grade is D ");
        else System.out.print("Student is fail ! ");






    }
    
}
