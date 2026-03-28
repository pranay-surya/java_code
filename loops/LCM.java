
// Create a program to find the Least Common Multiple [ LCM ] of two numbers

package loops;

import java.util.Scanner;

public class LCM {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to LCM");
        System.out.print("Please enter first number: ");
        int first = input.nextInt();
        System.out.print("Please enter second number: ");
        int second = input.nextInt();
        
        int i = 1;
        int lcm;
        while (true) {
            int factor = first * i;
            if (factor % second == 0) {
                lcm = factor;
                break;
            }
            i++;
        }
        System.out.println("LCM of the two numbers is: " + lcm);
        input.close();
    }
}