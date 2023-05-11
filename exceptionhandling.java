package com.exceptionhandling;
import java.util.*;

public class exceptionhandling {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);
		    System.out.print("Enter a number: ");

		    try {
		      int num = Integer.parseInt(scanner.nextLine());
		      int result = 100 / num;
		      System.out.println("Result = " + result);
		    } catch (NumberFormatException e) {
		      System.out.println("Invalid number format!");
		    } catch (ArithmeticException e) {
		      System.out.println("Cannot divide by zero!");
		    }

		    System.out.println("Program ended.");
		  }
		

	}


