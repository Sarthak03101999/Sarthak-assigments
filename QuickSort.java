package com.QuickSort;
public class QuickSort {
    public static void quickSort(int[] array, int low, int high) {
        if (low < high) {
            // Partition the array, and obtain the pivot index
            int pivotIndex = partition(array, low, high);

            // Recursively sort the left and right subarrays
            quickSort(array, low, pivotIndex - 1);
            quickSort(array, pivotIndex + 1, high);
        }
    }

    public static int partition(int[] array, int low, int high) {
        // Choose the rightmost element as the pivot
        int pivot = array[high];
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (array[j] < pivot) {
                // Swap array[i] and array[j]
                i++;
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }

        // Swap array[i+1] and array[high] to place the pivot in its correct position
        int temp = array[i + 1];
        array[i + 1] = array[high];
        array[high] = temp;

        return i + 1; // Return the pivot index
    }

    public static void main(String[] args) {
        int[] numbers = {5, 2, 8, 12, 1};
        System.out.println("Before sorting: ");
        printArray(numbers);

        quickSort(numbers, 0, numbers.length - 1);

        System.out.println("After sorting: ");
        printArray(numbers);
    }

    public static void printArray(int[] array) {
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
