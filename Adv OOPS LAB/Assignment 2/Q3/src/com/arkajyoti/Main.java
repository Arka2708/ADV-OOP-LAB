package Q3.src.com.arkajyoti;

import Q3.src.com.arkajyoti.BookList_Package.*;
import Q3.src.com.arkajyoti.MemberList_Package.*;

public class Main {
    public static void main(String[] args) {
        // Create an instance of LibraryManager
        LibraryManager libraryManager = new LibraryManager();
    
        // Add a book
        Book book1 = new Book(1, "Book 1", 10);
        libraryManager.addBook(book1);
        Book book2 = new Book(2, "Book 2", 5);
        libraryManager.addBook(book2);
    
        // View all books
        libraryManager.viewAllBooks();
    
        // Add a member
        Member member1 = new Member(1, "Arkajyoti Naskar", "24/05/2000");
        libraryManager.addMember(member1);
        Member member2 = new Member(2, "SKS", "15/07/1960");
        libraryManager.addMember(member2);
        // View all members
        libraryManager.viewAllMembers();    
 
    
        // Search for a book
        Book searchedBook = libraryManager.searchBook(1);
        if (searchedBook != null) {
            System.out.println("Found book: " + searchedBook.getName());
        } else {
            System.out.println("Book not found.");
        }
    
        // Search for a member
        Member searchedMember = libraryManager.searchMember(1);
        if (searchedMember != null) {
            System.out.println("Found member: " + searchedMember.getName());
        } else {
            System.out.println("Member not found.");
        }
          // Issue a book to a member
          int memberId = 1;
          int bookId = 1;
          libraryManager.issueBook(memberId, bookId);

          // Return a book from a member
          libraryManager.returnBook(memberId, bookId);
    } 
}

