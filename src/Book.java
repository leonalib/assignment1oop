class Book {
    private int BookId;
    private String Title;
    private String Author;

    public Book(int BookId, String Title, String Author) {
        this.BookId = BookId;
        this.Title = Title;
        this.Author = Author;
    }

    public int getBookId() {
        return BookId;
    }

    public String getTitle() {
        return Title;
    }

    public String getAuthor() {
        return Author;
    }

    public void setTitle(String Title) {
        this.Title = Title;
    }

    public void setAuthor(String Author) {
        this.Author = Author;
    }

    @Override
    public String toString() {
        return "Book{id=" + BookId + ", title='" + Title + "', author='" + Author + "'}";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Book)) return false;
        Book book = (Book) o;
        return BookId == book.BookId;
    }

    @Override
    public int hashCode() {
        return Integer.hashCode(BookId);
    }
}