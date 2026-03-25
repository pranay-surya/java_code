package ifStatement;

import java.util.Scanner;

public class AgeGroup {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the age :: ");
        int age = input.nextInt();

        if (age > 60) System.out.print("Person is Senior");
        else if (age < 13 ) System.out.print("Person is Child");
        else if (age < 20 ) System.out.print("Person is Teen ");
        else System.out.print("Person is Adult");
        input.close();

    }
    
}
