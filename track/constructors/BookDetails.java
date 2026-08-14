package track.constructors;


import java.util.Scanner;

class Book {
    String title;
    String author;

    Book(String title, String author) {
        // Store the title and author
        this.title = title;
        this.author = author;
    }

    void display() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
    }
}

public class BookDetails {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the book title and author
        // Create one Book object
        Book b = new Book(scanner.nextLine(), scanner.nextLine());

        // Call display()
        b.display();

        scanner.close();
    }
}