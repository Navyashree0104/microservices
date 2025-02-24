package com.o;

import java.io.FileWriter;
import java.io.IOException;

public class FilePersistence implements BookPersistence {
    @Override
    public void save(Books book) {
        try (FileWriter writer = new FileWriter("books.txt", true)) {
            writer.write(book.getName() + "," + book.getYear() + "," + book.getPrice() + "\n");
            System.out.println("Book saved to file.");
        } catch (IOException e) {
            System.out.println("Error saving book: " + e.getMessage());
        }
    }
}

