public class LibraryManagementSystem {
    public static void main(String[] args) {
        
        //1.Create 5 objects of the Book class, each representing a different book in the library.
       
        Book book1 = new Book("The Catcher in the Rye", "B001", "J.D. Salinger", 240);
        Book book2 = new Book("To Kill a Mockingbird", "B002", "Harper Lee", 281);
        Book book3 = new Book("1984", "B003", "George Orwell", 328);
        Book book4 = new Book("Pride and Prejudice", "B004", "Jane Austen", 432);
        Book book5 = new Book("The Hobbit", "B005", "J.R.R.Tolkein", 320);

        Book[] books ={book1,book2,book3,book4,book5};

        //2. Create 5 objects of the Magazine class, each representing a different magazine in the library.
        Magazine[] magazines = {
                new Magazine("National Geographic", "M001", "August 2023", "National Geographic Society"),
                new Magazine("Time", "M002", "September 2023", "Time USA, LLC"),
                new Magazine("Forbes", "M003", "June 2023", "Forbes Media"),
                new Magazine("Vogue", "M004", "July 2023", "Condé Nast"),
                new Magazine("Sports Illustrated", "M005", "July 2023", "Maven Coalition")
        };

        //3. Create 5 objects of the LibraryMember class, each representing a different member of the library.
        LibraryMember[] members = {
                new LibraryMember("L001", "John Doe"),
                new LibraryMember("L002", "Jane Smith"),
                new LibraryMember("L003", "David Johnson"),
                new LibraryMember("L004", "Sarah Williams"),
                new LibraryMember("L005", "Michael Brown")
        };

        // Check out and check in an item
        books[0].checkOut();
        books[0].checkIn();

        // Display the details of all the library items and library members
        System.out.println("Library Items:");
        for (LibraryItem item : books) {
            item.displayItemDetails();
            System.out.println();
        }
        for (LibraryItem item : magazines) {
            item.displayItemDetails();
            System.out.println();
        }

        System.out.println("Library Members:");
        for (LibraryMember member : members) {
            member.displayMemberDetails();
            System.out.println();
        }
    }
}
