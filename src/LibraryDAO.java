import java.sql.*;

public class LibraryDAO {

    private final DatabaseConnection db;

    public LibraryDAO(DatabaseConnection db) {
        this.db = db;
    }

    public Library loadLibrary(int id, String name) {
        Library library = new Library(id, name);
        String sql = "SELECT * FROM books";

        try (Connection conn = db.getConnection();
             Statement st = conn.createStatement();
             ResultSet rs = st.executeQuery(sql)) {

            while (rs.next()) {
                Book book = new Book(
                        rs.getInt("id"),
                        rs.getString("title"),
                        rs.getString("author")
                );
                library.addBook(book);
            }

        } catch (SQLException e) {
            System.out.println("Error loading library: " + e.getMessage());
        }

        return library;
    }
}