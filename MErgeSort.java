package com.MergrSort;

public class MErgeSort {

	   public static void mergeSort(int[] array) {
	        int n = array.length;

	        if (n <= 1) {
	            return; // Array is already sorted
	        }

	        int mid = n / 2;
	        int[] left = new int[mid];
	        int[] right = new int[n - mid];

	        // Divide the array into two halves
	        System.arraycopy(array, 0, left, 0, mid);
	        System.arraycopy(array, mid, right, 0, n - mid);

	        // Recursively sort the two halves
	        mergeSort(left);
	        mergeSort(right);

	        // Merge the sorted halves
	        merge(array, left, right);
	    }

	    public static void merge(int[] array, int[] left, int[] right) {
	        int leftLength = left.length;
	        int rightLength = right.length;
	        int i = 0; // Index for left array
	        int j = 0; // Index for right array
	        int k = 0; // Index for merged array

	        // Merge elements from left and right arrays into the merged array in sorted order
	        while (i < leftLength && j < rightLength) {
	            if (left[i] <= right[j]) {
	                array[k] = left[i];
	                i++;
	            } else {
	                array[k] = right[j];
	                j++;
	            }
	            k++;
	        }

	        // Copy remaining elements from left array, if any
	        while (i < leftLength) {
	            array[k] = left[i];
	            i++;
	            k++;
	        }

	        // Copy remaining elements from right array, if any
	        while (j < rightLength) {
	            array[k] = right[j];
	            j++;
	            k++;
	        }
	    }

	    public static void main(String[] args) {
	        int[] numbers = {5, 2, 8, 12, 1};
	        System.out.println("Before sorting: ");
	        printArray(numbers);

	        mergeSort(numbers);

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