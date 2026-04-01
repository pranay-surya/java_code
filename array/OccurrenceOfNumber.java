


// Creata a program to find the number of occurrences of an element in an array.

package array;
import java.util.Scanner;
public class OccurrenceOfNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int arr[] = {1,4,54,76,24,89,54,12,54,1};
        int key = 54;
        int i = 0;
        System.out.print("Array is :: ");
        while (i < arr.length) {
            System.out.print(arr[i]+" ");
            i++;
        }
        i = 0;
        int count = 0;
        while (i < arr.length) {
            if ( arr[i] == key ) {
                count++;
            }
            i++;
        }
        System.out.println();
        System.out.println("The Occurrence of key = "+key+" is "+count+" times ");

        input.close();

    }
    
}
