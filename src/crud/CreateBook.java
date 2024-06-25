package crud;
import java.util.Scanner;

public class CreateBook {
    private BookRepository repository;
    private Scanner scanner;

    public CreateBook(BookRepository repository, Scanner scanner) {
        this.repository = repository;
        this.scanner = scanner;
    }

    public void execute() {
        System.out.print("Enter book ID: ");
        int id = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        System.out.print("Enter book title: ");
        String title = scanner.nextLine();

        System.out.print("Enter book author: ");
        String author = scanner.nextLine();

        System.out.print("Enter book price: ");
        double price = scanner.nextDouble();
        scanner.nextLine(); // Consume newline

        Book book = new Book(id, title, author, price);
        repository.addBook(book);
        System.out.println("Book added successfully.");
    }
}
