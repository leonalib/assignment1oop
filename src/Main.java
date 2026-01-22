import java.util.List;

public class Main {
    public static void main(String[] args) {

        System.out.println("LIBRARY SYSTEM");

        // 1. Database connection
        DatabaseConnection db = new DatabaseConnection(
                "jdbc:postgresql://localhost:5432/oop_db",
                "postgres",
                "1234"
        );

        // 2. BookDAO
        BookDAO bookDAO = new BookDAO(db);

        System.out.println("\n--- Adding books ---");
        Book book1 = new Book(1, "Harry Potter", "J. K. Rowling");
        Book book2 = new Book(2, "Clean Code", "Robert Martin");

        bookDAO.addBook(book1);
        bookDAO.addBook(book2);

        System.out.println("\n--- All books from DB ---");
        List<Book> books = bookDAO.getAllBooks();
        for (Book b : books) {
            System.out.println(b);
        }

        // 3. Library + LibraryDAO
        System.out.println("\n--- Loading library ---");
        LibraryDAO libraryDAO = new LibraryDAO(db);
        Library library = libraryDAO.loadLibrary(1, "Central Library");

        System.out.println(library);

        System.out.println("\n--- Find book by title ---");
        Book foundBook = library.findBookByTitle("Harry Potter");
        System.out.println(foundBook);

        // 4. Library users
        System.out.println("\n--- Library users ---");
        LibraryUserDAO userDAO = new LibraryUserDAO(db);

        Student student1 = new Student(1, "Aisha");
        Student student2 = new Student(2, "Dana");

        userDAO.addUser(student1);
        userDAO.addUser(student2);

        System.out.println("\n--- All users ---");
        List<LibraryUser> users = userDAO.getAllUsers();
        for (LibraryUser u : users) {
            System.out.println(u);
        }

        System.out.println("\nPROGRAM FINISHED SUCCESSFULLY");
    }
}