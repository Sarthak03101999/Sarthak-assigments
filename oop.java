package com.oop;

public class oop {

	public static void main(String[] args) {
		Person person = new Person("John", 30);

        // Call the methods on the Person object
        person.sayHello();
        person.walk(5);
        person.run(10);

        // Create an object of the Rectangle class
        Rectangle rectangle = new Rectangle(5, 10);

        // Call the methods on the Rectangle object
        System.out.println("Width = " + rectangle.getWidth());
        System.out.println("Height = " + rectangle.getHeight());
        System.out.println("Area = " + rectangle.getArea());
        System.out.println("Perimeter = " + rectangle.getPerimeter());
    }
}

class Person {
    private String name;
    private int age;

    // Constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Methods
    public void sayHello() {
        System.out.println("Hello, my name is " + name + " and I'm " + age + " years old.");
    }

    public void walk(int distance) {
        System.out.println(name + " is walking " + distance + " miles.");
    }

    public void run(int distance) {
        System.out.println(name + " is running " + distance + " miles.");
    }
}

class Rectangle {
    private int width;
    private int height;

    // Constructor
    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    // Getter methods
    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    // Methods
    public int getArea() {
        return width * height;
    }

    public int getPerimeter() {
        return 2 * (width + height);
    }

	}

