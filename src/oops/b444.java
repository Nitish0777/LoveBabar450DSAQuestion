package oops;
import java.util.*;
import java.io.*;
//import java.io.File;
//import java.io.FileReader;
//import java.io.FileWriter;
//import java.io.IOException;


public class b444 {
    public static void main(String[] args) {
        // Create a file
        File file = new File("example.txt");

        try {
            // Write data to the file
            FileWriter writer = new FileWriter(file);
            writer.write("Hello, World!");
            writer.close();

            // Read data from the file
            FileReader reader = new FileReader(file);
            char[] buffer = new char[100];
            int length = reader.read(buffer);
            reader.close();

            // Display the data read from the file
            String data = new String(buffer, 0, length);
            System.out.println("Data read from file: " + data);
        } catch (IOException e) {
            // Exception handling
            System.out.println("An error occurred: " + e.getMessage());
        } finally {
            // Delete the file (cleanup)
            if (file.exists()) {
                file.delete();
            }
        }
    }
}