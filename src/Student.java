class Student extends LibraryUser {

    public Student(int UserId, String Name) {
        super(UserId, Name);
    }

    @Override
    public String getRole() {
        return "STUDENT";
    }
}

//without dao