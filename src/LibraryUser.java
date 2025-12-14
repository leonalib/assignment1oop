class LibraryUser{
    private int UserId;
    private String Name;

    public LibraryUser(int UserId, String Name) {
        this.UserId = UserId;
        this.Name = Name;
    }

    public int getUserId(){
         return UserId;
    }

    public String getName(){
        return Name;
    }

    public void setName(){
        this.Name = Name;
    }

    public void printInfo(){
        System.out.println(
                "User Id: " + UserId +
                        ", User Name: " + Name
        );
    }
}
