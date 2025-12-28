abstract class LibraryUser {
    protected int UserId;
    protected String Name;

    public LibraryUser(int UserId, String Name) {
        this.UserId = UserId;
        this.Name = Name;
    }

    public abstract String getRole();

    @Override
    public String toString() {
        return "User{id=" + UserId + ", name='" + Name + "', role=" + getRole() + "}";
    }
}