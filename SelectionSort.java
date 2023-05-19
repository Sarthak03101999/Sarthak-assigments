package com.SelectionSort;

public class SelectionSort {
	  public static void selectionSort(int[] array) {
	        int n = array.length;

	        for (int i = 0; i < n - 1; i++) {
	            int minIndex = i;

	            // Find the index of the minimum element in the remaining unsorted part of the array
	            for (int j = i + 1; j < n; j++) {
	                if (array[j] < array[minIndex]) {
	                    minIndex = j;
	                }
	            }

	            // Swap the minimum element with the first element in the unsorted part of the array
	            int temp = array[minIndex];
	            array[minIndex] = array[i];
	            array[i] = temp;
	        }
	    }


	public static void main(String[] args) {
		 int[] numbers = {5, 2, 8, 12, 1};
	        System.out.println("Before sorting: ");
	        printArray(numbers);

	        selectionSort(numbers);

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
	
		  
		

