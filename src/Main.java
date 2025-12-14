public class Main {
    public static void main(String[] args) {

        Book book1 = new Book(1, "Harry Potter", "Rowling");
        Book book2 = new Book(2, "Murder on the Orient Express", "Agata Kristi");

        Library library = new Library(1, "Digital Library");
        LibraryUser user = new LibraryUser(8, "Aisha");

        book1.printInfo();
        book2.printInfo();
        library.printInfo();
        user.printInfo();

        if (book1.equals(book2)) {
            System.out.println("Books are the same");
        } else {
            System.out.println("Books are different");
    }}}