package com.LinearSearch;

public class LinearSearch {
	public static int linearSearch(int[] array, int target) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == target) {
                return i; // Target found, return the index
            }
        }
        return -1;
    }

	public static void main(String[] args) {
		 int[] numbers = {5, 8, 2, 10, 3};
	        int target = 10;
	        int index = linearSearch(numbers, target);

	        if (index != -1) {
	            System.out.println("Target found at index " + index);
	        } else {
	            System.out.println("Target not found");
	        }
	    }
		

	}


