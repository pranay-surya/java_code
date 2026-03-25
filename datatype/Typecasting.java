//  Demo of Implicit and Explicit Type Casting

package datatype;

public class Typecasting {
    public static void main(String[] args) {
        int a = 10;
        double b = a;
        System.out.println("Implicit Type Casting 'Int became double' ");
        System.out.println("Value of b "+ b);

        double x = 8.97;
        int y = (int) x;
        System.out.println("Explicit Type Casting 'Need to mention int Explicitly'");
        System.out.println("Value of y "+y);
        


    }
}
