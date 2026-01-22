import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class LibraryUserDAO {

    private final DatabaseConnection db;

    public LibraryUserDAO(DatabaseConnection db) {
        this.db = db;
    }

    // CREATE
    public void addUser(LibraryUser user) {
        String sql = "INSERT INTO library_users (id, name, role) VALUES (?, ?, ?)";

        try (Connection conn = db.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setInt(1, user.UserId);
            ps.setString(2, user.Name);
            ps.setString(3, user.getRole());

            ps.executeUpdate();

        } catch (SQLException e) {
            System.out.println("Error adding user: " + e.getMessage());
        }
    }

    // READ
    public List<LibraryUser> getAllUsers() {
        List<LibraryUser> users = new ArrayList<>();
        String sql = "SELECT * FROM library_users";

        try (Connection conn = db.getConnection();
             Statement st = conn.createStatement();
             ResultSet rs = st.executeQuery(sql)) {

            while (rs.next()) {
                String role = rs.getString("role");

                if ("STUDENT".equals(role)) {
                    users.add(new Student(
                            rs.getInt("id"),
                            rs.getString("name")
                    ));
                }
                // если будут другие роли — добавишь сюда
            }

        } catch (SQLException e) {
            System.out.println("Error reading users: " + e.getMessage());
        }

        return users;
    }
}