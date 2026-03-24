package variables;

public class Swapnumber {
    public static void main(String[] args) {
        // Method - 1
        int a = 5;
        int b = 9;
        int temp = a;
        System.out.println("Numbers Swaping Using Third Variable");
        System.out.println("Numbers before Swaping ");
        System.out.println("a :: "+a);
        System.out.println("b :: "+b);
        a = b;
        b = temp;
        System.out.println("Numbers After  Swaping ");
        System.out.println("a :: "+a);
        System.out.println("b :: "+b);


        //  Method - 2
        int x = 5;
        int y = 9;
        System.out.println("Numbers Swaping Without Using Third Variable");
        System.out.println("Numbers before Swaping ");
        System.out.println("x :: "+x);
        System.out.println("y :: "+y);
        x = x+y;
        y = x-y;
        x = x-y;
        System.out.println("Numbers After  Swaping ");
        System.out.println("x :: "+x);
        System.out.println("y :: "+y);

    }
    
}
