class Book extends LibraryItem {
    private String author;
    private int numPages;

    public Book( String title, String itemID, String author, int numPages ) {
        super( title, itemID );
        this.author = author;
        this.numPages = numPages;
    }
}