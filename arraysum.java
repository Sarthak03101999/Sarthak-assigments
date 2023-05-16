package com.arraysum;

public class arraysum {

	public static void main(String[] args) {
		 int[] arr = {2, 4, 6, 8, 10, 12, 14};
	        int n = arr.length;
	        int L = 2;
	        int R = 5;
	        
	        int sum = calculateSumInRange(arr, L, R);
	        System.out.println("Sum of elements in the range [" + L + ", " + R + "]: " + sum);
	    }
	    
	    public static int calculateSumInRange(int[] arr, int L, int R) {
	        int sum = 0;
	        
	        for (int i = L; i <= R; i++) {
	            sum += arr[i];
	        }
	        
	        return sum;
	    }

	}


