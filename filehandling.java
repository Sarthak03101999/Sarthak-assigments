package com.filehandling;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;


public class filehandling {

	public static void main(String[] args) {
		 File file = new File("example.txt");

	        // Creating a new file
	        try {
	            if (file.createNewFile()) {
	                System.out.println("File created: " + file.getName());
	            } else {
	                System.out.println("File already exists.");
	            }
	        } catch (IOException e) {
	            System.out.println("An error occurred while creating the file.");
	            e.printStackTrace();
	        }

	        // Writing to a file
	        try {
	            FileWriter writer = new FileWriter(file);
	            writer.write("Hello, world!\n");
	            writer.write("This is an example of file handling in Java.\n");
	            writer.close();
	            System.out.println("Successfully wrote to the file.");
	        } catch (IOException e) {
	            System.out.println("An error occurred while writing to the file.");
	            e.printStackTrace();
	        }

	        // Reading from a file
	        try {
	            Scanner reader = new Scanner(file);
	            while (reader.hasNextLine()) {
	                String data = reader.nextLine();
	                System.out.println(data);
	            }
	            reader.close();
	        } catch (FileNotFoundException e) {
	            System.out.println("An error occurred while reading from the file.");
	            e.printStackTrace();
	        }

	        // Updating a file
	        try {
	            FileWriter writer = new FileWriter(file, true); // true for append mode
	            writer.write("This is an update to the file.\n");
	            writer.close();
	            System.out.println("Successfully updated the file.");
	        } catch (IOException e) {
	            System.out.println("An error occurred while updating the file.");
	            e.printStackTrace();
	        }

	        // Deleting a file
	        if (file.delete()) {
	            System.out.println("File deleted: " + file.getName());
	        } else {
	            System.out.println("Failed to delete the file.");
	        }
		

	}

}
