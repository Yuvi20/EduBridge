package crud;

import java.util.Scanner;

public class UpdateBook {
    private BookRepository repository;
    private Scanner scanner;

    public UpdateBook(BookRepository repository, Scanner scanner) {
        this.repository = repository;
        this.scanner = scanner;
    }

    public void execute() {
        System.out.print("Enter book ID to update: ");
        int id = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        Book book = repository.getBookById(id);
        if (book != null) {
            System.out.print("Enter new title: ");
            String title = scanner.nextLine();

            System.out.print("Enter new author: ");
            String author = scanner.nextLine();

            System.out.print("Enter new price: ");
            double price = scanner.nextDouble();
            scanner.nextLine(); // Consume newline

            book.setTitle(title);
            book.setAuthor(author);
            book.setPrice(price);

            repository.updateBook(book);
            System.out.println("Book updated successfully.");
        } else {
            System.out.println("Book not found.");
        }
    }
}

