import java.util.*;

public class BubbleSortAlgorithm {
    // Function to perform bubble sort on an array
    static void bubble_sort(int[] arr, int n) {
        // Outer loop iterates from the end of the array towards the beginning
        for (int i = n - 1; i >= 0; i--) {
            // Inner loop compares adjacent elements and swaps them if they are in the wrong order
            for (int j = 0; j <= i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        // Print the sorted array after bubble sort
        System.out.println("After bubble sort: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    
    public static void main(String args[]) {
        int arr[] = {13, 46, 24, 52, 20, 9}; // Input array
        int n = arr.length; // Length of the array

        // Print the original array before sorting
        System.out.println("Before Using Bubble Sort: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        // Call the bubble_sort function to sort the array
        bubble_sort(arr, n);
    }
}
