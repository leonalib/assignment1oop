import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class BookDAO {

    private final DatabaseConnection db;

    public BookDAO(DatabaseConnection db) {
        this.db = db;
    }

    public void addBook(Book book) {
        String sql = "INSERT INTO public.books (id, title, author) VALUES (?, ?, ?)";

        try (Connection conn = db.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setInt(1, book.getId());
            ps.setString(2, book.getTitle());
            ps.setString(3, book.getAuthor());
            ps.executeUpdate();

        } catch (SQLException e) {
            System.out.println("Error adding book: " + e.getMessage());
        }
    }

    public List<Book> getAllBooks() {
        List<Book> books = new ArrayList<>();
        String sql = "SELECT * FROM books";

        try (Connection conn = db.getConnection();
             Statement st = conn.createStatement();
             ResultSet rs = st.executeQuery(sql)) {

            while (rs.next()) {
                books.add(new Book(
                        rs.getInt("id"),
                        rs.getString("title"),
                        rs.getString("author")
                ));
            }

        } catch (SQLException e) {
            System.out.println("Error reading books: " + e.getMessage());
        }

        return books;
    }
}