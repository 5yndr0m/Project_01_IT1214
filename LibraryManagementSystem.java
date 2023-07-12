public class LibraryManagementSystem {
    public static void main(String[] args) {
        // Create 5 objects of the Book class
        Book[] books = {
                new Book("Python Crash Course", "B001", "Eric Matthes", 544),
                new Book("The Great Gatsby", "B002", "F. Scott Fitzgerald", 180),
                new Book("To Kill a Mockingbird", "B003", "Harper Lee", 324),
                new Book("1984", "B004", "George Orwell", 328),
                new Book("The Catcher in the Rye", "B005", "J.D. Salinger", 234)
        };

        // Create 5 objects of the Magazine class
        Magazine[] magazines = {
                new Magazine("National Geographic", "M001", "July 2023", "National Geographic Society"),
                new Magazine("Time", "M002", "June 2023", "Time USA, LLC"),
                new Magazine("Vogue", "M003", "August 2023", "Condé Nast"),
                new Magazine("The Economist", "M004", "July 2023", "The Economist Group"),
                new Magazine("Sports Illustrated", "M005", "July 2023", "ABG-SI LLC")
        };

        // Create 5 objects of the LibraryMember class
        LibraryMember[] members = {
                new LibraryMember("L001", "John Doe"),
                new LibraryMember("L002", "Jane Smith"),
                new LibraryMember("L003", "Michael Johnson"),
                new LibraryMember("L004", "Emily Davis"),
                new LibraryMember("L005", "Robert Brown")
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
