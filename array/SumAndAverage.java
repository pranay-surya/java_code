

// Create a program to find the sum and average of all element in an array.

package array;
import java.util.Scanner;
public class SumAndAverage {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Array Sum and Average");
        System.out.print("Enter the number of element in an array :: ");
        int n = input.nextInt();

        // input Array 
        int arr[] = new int[n];
        int i = 0;
        System.out.println("Enter element: ");
        while ( i < n) {
            arr[i] = input.nextInt();
            i++;

        }

        // print Array
        System.out.print("Array is :: ");
        i = 0;
        while (i < n) {
            System.out.print(arr[i] + " ");
            i++;
        }

        // Sum and Average
        i = 0;
        int sum = 0;
        while (i < arr.length) {
            sum += arr[i];
            i++;

        }

        double avg = sum/n;
        System.out.println();
        System.out.println("Array Sum is :: "+sum);
        System.out.println("Array Average is :: "+avg);

        input.close();



    
    }
    
}
