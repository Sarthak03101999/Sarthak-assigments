package com.ExponentialSearch1;

public class ExponentialSearch1 {
	public static int exponentialSearch(int[] array, int target) {
        if (array[0] == target) {
            return 0; // Target found at index 0
        }

        int size = array.length;
        int bound = 1;
        while (bound < size && array[bound] <= target) {
            bound *= 2; // Double the bound
        }

        int left = bound / 2; // The left index for binary search
        int right = Math.min(bound, size - 1); // The right index for binary search

        return binarySearch(array, target, left, right);
    }

    public static int binarySearch(int[] array, int target, int left, int right) {
        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (array[mid] == target) {
                return mid; // Target found, return the index
            }

            if (array[mid] < target) {
                left = mid + 1; // Target is in the right half
            } else {
                right = mid - 1; // Target is in the left half
            }
        }

        return -1; // Target not found
    }

	public static void main(String[] args) {
		
		 int[] numbers = {2, 5, 8, 10, 15, 20};
	        int target = 10;
	        int index = exponentialSearch(numbers, target);

	        if (index != -1) {
	            System.out.println("Target found at index " + index);
	        } else {
	            System.out.println("Target not found");
	        }
	    }
	}


