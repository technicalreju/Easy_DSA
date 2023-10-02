import java.util.*;

public class SelectionSortAlgorithm {
    // Function to perform selection sort on an array
    static void selection_sort(int arr[], int n) {
        // Outer loop iterates through each element in the array
        for (int i = 0; i < n - 1; i++) {
            int mini = i; // Assume the current index has the minimum value

            // Inner loop compares the current element with the rest of the elements
            for (int j = i + 1; j < n; j++) {
                // If a smaller element is found, update the index of the minimum
                if (arr[j] < arr[mini]) {
                    mini = j;
                }
            }

            // Swap the current element with the minimum element found in the inner loop
            int temp = arr[mini];
            arr[mini] = arr[i];
            arr[i] = temp;
        }

        // Print the sorted array after selection sort
        System.out.println("After selection sort:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String args[]) {
        int arr[] = {13, 46, 24, 52, 20, 9}; // Input array
        int n = arr.length; // Length of the array

        // Print the original array before sorting
        System.out.println("Before selection sort:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        // Call the selection_sort function to sort the array
        selection_sort(arr, n);
    }
}
