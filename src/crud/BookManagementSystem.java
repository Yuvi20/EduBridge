package crud;

import java.util.Scanner;

public class BookManagementSystem {
    private BookRepository repository = new BookRepository();
    private Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        BookManagementSystem system = new BookManagementSystem();
        system.run();
    }

    public void run() {
        while (true) {
            System.out.println("1. Add Book");
            System.out.println("2. View Books");
            System.out.println("3. Update Book");
            System.out.println("4. Delete Book");
            System.out.println("5. Exit");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    new CreateBook(repository, scanner).execute();
                    break;
                case 2:
                    new ReadBooks(repository).execute();
                    break;
                case 3:
                    new UpdateBook(repository, scanner).execute();
                    break;
                case 4:
                    new DeleteBook(repository, scanner).execute();
                    break;
                case 5:
                    System.out.println("Exiting...");
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
