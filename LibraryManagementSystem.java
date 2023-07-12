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
        
        Magazine magazine1 = new Magazine("National Geographic", "M001", "August 2023", "National Geographic Society");
        Magazine magazine2 = new Magazine("Time", "M002", "September 2023", "Time USA, LLC");
        Magazine magazine3 = new Magazine("Forbes", "M003", "June 2023", "Forbes Media");
        Magazine magazine4 = new Magazine("Vogue", "M004", "July 2023", "Condé Nast");
        Magazine magazine5 = new Magazine("Sports Illustrated", "M005", "July 2023", "Maven Coalition");
        
        Magazine[] magazines = {magazine1,magazine2,magazine3,magazine4,magazine5};

        //3. Create 5 objects of the LibraryMember class, each representing a different member of the library.
        
        LibraryMember member1 = new LibraryMember("L001", "John Doe");
        LibraryMember member2 = new LibraryMember("L002", "Jane Smith");
        LibraryMember member3 = new LibraryMember("L003", "David Johnson");
        LibraryMember member4 = new LibraryMember("L004", "Sarah Williams");
        LibraryMember member5 = new LibraryMember("L005", "Michael Brown");

        LibraryMember[] members = {member1,member2,member3,member4,member5};

        //4. Set the properties of the objects using appropriate setter methods.

        //5. Call the checkOut() and checkIn() methods on one of the library items.
        System.out.println("Checking out the book with BookID B001");
        books[0].checkOut();
        System.out.println("\nChecking back in the book with BookID B001");
        books[0].checkIn();

        //6. Display the details of all the library items and library members.
        System.out.println("\nLibrary Items :");
        System.out.println("\nBooks :");
        for (LibraryItem item : books) {
            item.displayItemDetails();
        }
        System.out.println("\nMagazines :");
        for (LibraryItem item : magazines) {
            item.displayItemDetails();
        }

        System.out.println("\nLibrary Members:");
        for (LibraryMember member : members) {
            member.displayMemberDetails();
            
        }
    }
}
