package crud;

import java.util.Scanner;

public class DeleteBook {
    private BookRepository repository;
    private Scanner scanner;

    public DeleteBook(BookRepository repository, Scanner scanner) {
        this.repository = repository;
        this.scanner = scanner;
    }

    public void execute() {
        System.out.print("Enter book ID to delete: ");
        int id = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        repository.deleteBook(id);
        System.out.println("Book deleted successfully.");
    }
}
