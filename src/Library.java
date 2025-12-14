class Library {
    private int LibraryId;
    private String LibraryName;

    public Library(int LibraryId, String LibraryName){
        this.LibraryId = LibraryId;
        this.LibraryName = LibraryName;
    }

    public String getLibraryName(){
        return LibraryName;
    }

    public int getLibraryId(){
        return LibraryId;
    }

    public void setLibraryName(String LibraryName){
        this.LibraryName = LibraryName;
    }

    public void printInfo(){
        System.out.println(
                "Library Id: " + LibraryId +
                        ", Library Name: " + LibraryName
        );

}}
