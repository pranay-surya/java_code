

// Create a program that determines if a given year is a leap year 
//-> Considering condition like divisible by 4, but not 100, unless also divisible by 400
package ifStatement;
import java.util.Scanner;
public class LeapYear {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.println("Leap year checking ");
        System.out.print("Enter the year :: ");
        int year = input.nextInt();

        if ((year % 4 == 0 && year % 100 != 0 ) || (year % 400 == 0)){
            System.out.println("Year "+year+ " is a leap year");

        }
        else {
            System.out.println("Year " +year+ " is not a leap year");

        }
        input.close();

    }
}
