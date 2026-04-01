
// Creata a program to find the maxinum and minimum  element in an array.

package array;
import java.util.Scanner;
public class MinMax {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int arr[] = {1,4,54,76,24,89,54,12,54,1};
        int i = 0;
        System.out.print("Array is :: ");
        while (i < arr.length) {
            System.out.print(arr[i]+" ");
            i++;

        }

            int max = arr[0];
            i = 1;
            while ( i < arr.length ) {
                if (arr[i] > max ){
                    max = arr[i];
                }
                i++;
            }
            int min = arr[0];
            i = 1;
            while ( i < arr.length ) {
                if (arr[i] < min ){
                    min = arr[i];
                }
                i++;
            }
            System.out.println();
            System.out.println("Maximum element in an array is :: "+max);
            System.out.println("Minimum element in an array is :: "+min);

            input.close();

        }
        
}
