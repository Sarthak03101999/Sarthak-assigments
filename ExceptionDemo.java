package com.custom;

class CustomException extends Exception {
    public CustomException(String message) {
        super(message);
    }
}

public class ExceptionDemo {
    public static void main(String[] args) {
        try {
            int a = 10;
            int b = 0;

            if (b == 0) {
                throw new CustomException("Cannot divide by zero");
            }

            int c = a / b;
            System.out.println("Result: " + c);
        } catch (CustomException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            System.out.println("Finally block executed");
        }
    }
}
