public class Main {
    public static void main(String[] args) {

        Book book1 = new Book(1, "Harry Potter", "Rowling");
        Book book2 = new Book(2, "Murder on the Orient Express", "Agatha Christie");

        Library library = new Library(1, "Digital Library");
        library.addBook(book1);
        library.addBook(book2);

        LibraryUser user = new Student(8, "Aisha");

        System.out.println(book1);
        System.out.println(book2);
        System.out.println(library);
        System.out.println(user);

        if (book1.equals(book2)) {
            System.out.println("Books are the same");
        } else {
            System.out.println("Books are different");
        }
    }
}