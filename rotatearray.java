package com.rotatearray;

public class rotatearray {

	public static void main(String[] args) {
		 int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
	        int steps = 5;
	        
	        rotateArray(arr, steps);
	        
	        System.out.println("Rotated array:");
	        for (int num : arr) {
	            System.out.print(num + " ");
	        }
	    }
	    
	    public static void rotateArray(int[] arr, int steps) {
	        int length = arr.length;
	        steps = steps % length; // To handle steps greater than array length
	        
	        reverse(arr, 0, length - 1);
	        reverse(arr, 0, steps - 1);
	        reverse(arr, steps, length - 1);
	    }
	    
	    public static void reverse(int[] arr, int start, int end) {
	        while (start < end) {
	            int temp = arr[start];
	            arr[start] = arr[end];
	            arr[end] = temp;
	            start++;
	            end--;
	        }
	    }
	

	}

