/**
 * This interface defines the methods that a library management system should implement.
 * It includes methods for adding books and members, searching for books and members by ID,
 * viewing all books and members, and issuing and returning books.
 */
package Q3.src.com.arkajyoti;

import Q3.src.com.arkajyoti.BookList_Package.Book;
import Q3.src.com.arkajyoti.MemberList_Package.Member;

public interface LibraryManagement {
    void addBook(Book book);
    Book searchBook(int bookId);
    void viewAllBooks();
    void addMember(Member member);
    Member searchMember(int memberId);
    void viewAllMembers();
    void issueBook(int memberId, int bookId);
    void returnBook(int memberId, int bookId);
}
