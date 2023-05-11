package com.fileOpeations1;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.List;
import java.util.Scanner;


public class fileoperations1 {

	public static void main(String[] args)throws IOException {
		Scanner scanner = new Scanner(System.in);
        String fileName = "test.txt";
        File file = new File(fileName);

        // Create a new file
        if (file.createNewFile()) {
            System.out.println("File created: " + file.getName());
        } else {
            System.out.println("File already exists.");
        }

        // Write to the file
        System.out.print("Enter text to write to the file: ");
        String text = scanner.nextLine();
        Files.write(Paths.get(fileName), text.getBytes(), StandardOpenOption.APPEND);

        // Read from the file
        List<String> lines = Files.readAllLines(Paths.get(fileName));
        System.out.println("Contents of the file:");
        for (String line : lines) {
            System.out.println(line);
        }

        // Update the file
        System.out.print("Enter text to append to the file: ");
        text = scanner.nextLine();
        Files.write(Paths.get(fileName), text.getBytes(), StandardOpenOption.APPEND);

        // Read from the file again to see the changes
        lines = Files.readAllLines(Paths.get(fileName));
        System.out.println("Contents of the file after updating:");
        for (String line : lines) {
            System.out.println(line);
        }

        // Delete the file
        if (file.delete()) {
            System.out.println("File deleted: " + file.getName());
        } else {
            System.out.println("Failed to delete the file.");
        }
    }

	

	}


