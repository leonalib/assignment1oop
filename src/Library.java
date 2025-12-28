import java.util.ArrayList;
import java.util.List;

class Library {
    private int LibraryId;
    private String LibraryName;
    private List<Book> books = new ArrayList<>();

    public Library(int LibraryId, String LibraryName) {
        this.LibraryId = LibraryId;
        this.LibraryName = LibraryName;
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public Book findBookByTitle(String title) {
        for (Book b : books) {
            if (b.getTitle().equalsIgnoreCase(title)) {
                return b;
            }
        }
        return null;
    }

    @Override
    public String toString() {
        return "Library{id=" + LibraryId +
                ", name='" + LibraryName +
                "', books=" + books.size() + "}";
    }
}