
//  create a program to reverse an array.

package array;
public class ReverseArray {
    public static void main(String[] args) {

        int arr[] = {1, 2, 3, 4, 5};
        int i = 0;
        System.out.print("Array is :: ");
        while (i < arr.length) {
            System.out.print(arr[i]+" ");
            i++;

        }
        System.out.println();

        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            // swap
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }

        // print reversed array
        System.out.print("Reversed array: ");
        i = 0;
        while (i < arr.length) {
            System.out.print(arr[i] + " ");
            i++;
        }
    }
}