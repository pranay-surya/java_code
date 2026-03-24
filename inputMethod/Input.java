package inputMethod;
import java.util.*;

public class Input {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the name :: ");
        String c = input.next();

        System.out.print("Enter the Age :: ");
        int a = input.nextInt();

        System.out.print("Enter the Salary :: ");
        double b = input.nextDouble();

        System.out.print("Are you male (true/false) ::");
        boolean d = input.nextBoolean();
        
        System.out.print("User Profile ::");
        System.out.println("Name :: "+c);
        System.out.println("Age :: "+a);
        System.out.println("Salary :: "+b);
        System.out.println("IS male :: "+d);




        
    }
    
}
