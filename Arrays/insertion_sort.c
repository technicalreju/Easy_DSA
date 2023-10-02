#include <stdio.h>

// function to perforn Insertion Sort
void insertionSort(int arr[], int n)
{
    int i, key, j;
    for (i = 1; i < n; i++)
    {
        key = arr[i];
        j = i - 1;
        while (j >= 0 && arr[j] > key)
        {
            arr[j + 1] = arr[j];
            j = j - 1;
        }
        arr[j + 1] = key;
    }
}

int main()
{ // declare variables
    int n, i = 0, j = 0;

    // taking number of elements as input
    printf("Enter the number of elements in the array: ");
    scanf("%d", &n);
    int a[n];

    // taking elements of array as input
    printf("Enter the elements of the array:\n");
    for (i = 0; i < n; i++)
    {
        scanf("%d", &a[i]);
    }

    // Function calll
    insertionSort(a, n);

    // printing the Array
    for (int i = 0; i < n; i++){
        printf("%d ", a[i]); 
    }

    return 0;
}
