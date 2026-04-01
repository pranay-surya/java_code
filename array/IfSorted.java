

// Create a program to check if the given array is sorted array

package array;
import java.util.Scanner;
public class IfSorted {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int arr[] = {1,4,6,8,10,45};
        int i = 0;
        System.out.print("Array is :: ");
        while (i < arr.length) {
            System.out.print(arr[i]+" ");
            i++;

        }
        System.out.println();
        i = 0;
        boolean isSorted = true;
        while (i < arr.length - 1) {
            if (arr[i] > arr[i+1] ) {
                isSorted = false;
                break;
            }
            i++;         
        }

        if (isSorted) System.out.println("Array is Sorted ");
        else System.out.println("Array is not sorted ");

        input.close();

    
    }
}
