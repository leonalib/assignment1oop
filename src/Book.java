class Book{
    private int BookId;
    private String Title;
    private String Author;

    public Book(int BookId, String Title, String Author){
        this.BookId=BookId;
        this.Title=Title;
        this.Author=Author;
    }

    public int getBookId(){
        return BookId;
    }

    public String getTitle(){
        return Title;
    }

    public String getAuthor(){
        return Author;
    }

    public void setTitle(String Title){
        this.Title = Title;
    }

    public void setAuthor(String Author){
        this.Author = Author;
    }

    public void printInfo(){
        System.out.println(
                "Book Id: " + BookId +
                        ", Title: " + Title +
                        ", Author: " + Author
        );
    }

    public boolean equals(Book other){
        return this.BookId == other.BookId;
    }
}