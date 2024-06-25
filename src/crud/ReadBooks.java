package crud;

public class ReadBooks {
    private BookRepository repository;

    public ReadBooks(BookRepository repository) {
        this.repository = repository;
    }

    public void execute() {
        if (repository.getAllBooks().isEmpty()) {
            System.out.println("No books available.");
        } else {
            for (Book book : repository.getAllBooks()) {
                System.out.println(book);
            }
        }
    }
}
