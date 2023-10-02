import java.util.*;

public class InsertionSortAlgorithm {
    // Function to perform insertion sort on an array
    static void insertion_sort(int[] arr, int n) {
        // Outer loop iterates through each element in the array
        for (int i = 0; i <= n - 1; i++) {
            int j = i;

            // Inner loop compares the current element with its predecessors and swaps if necessary
            while (j > 0 && arr[j - 1] > arr[j]) {
                int temp = arr[j - 1];
                arr[j - 1] = arr[j];
                arr[j] = temp;
                j--;
            }
        }

        // Print the sorted array after insertion sort
        System.out.println("After insertion sort: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    
    public static void main(String args[]) {
        int arr[] = {13, 46, 24, 52, 20, 9}; // Input array
        int n = arr.length; // Length of the array

        // Print the original array before sorting
        System.out.println("Before Using Insertion Sort: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        // Call the insertion_sort function to sort the array
        insertion_sort(arr, n);
    }
}
