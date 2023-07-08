abstract class LibraryItem{

    private String title;
    private String itemID;
    private boolean checkedOut;//to check the book's availability

    public LibraryItem( String title, String itemID ) {
        this.title = title;
        this.itemID = itemID;
        this.checkedOut = false;
    }

    public void checkOut() {
        if (!checkedOut) {
            checkedOut = true;
            System.out.println( title + " has been checked out." );
        } else {
            System.out.println( title + " is already checked out." );
        }
    }

    public void checkIn() {
        if (checkedOut) {
            checkedOut = false;
            System.out.println( title + " has been checked in." );
        } else {
            System.out.println( title + " is already checked in." );
        }
    }

    public void displayItemDetails() {
        System.out.println( "Title : " + title );
        System.out.println( "Item ID : " + itemID );
        System.out.println( "Status : " + (checkedOut ? "Checked Out" : "Checked In" ));
    }

}