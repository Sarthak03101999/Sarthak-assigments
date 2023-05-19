package com.BinarySearch;

public class BinarySearch {
	public static int binarySearch(int[] array, int target) {
        int left = 0;
        int right = array.length - 1;

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
        int index = binarySearch(numbers, target);

        if (index != -1) {
            System.out.println("Target found at index " + index);
        } else {
            System.out.println("Target not found");
        }
    }

	}


