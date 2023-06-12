package Q3.src.com.arkajyoti;

import Q3.src.com.arkajyoti.BookList_Package.*;
import Q3.src.com.arkajyoti.MemberList_Package.*;
import Q3.src.com.arkajyoti.TransactionList_Package.*;

    public class LibraryManager implements LibraryManagement {
        public LibraryManager(){}
        
        @Override
        public void addBook(Book book) {
            BookList.addBook(book);
        }

        @Override
        public Book searchBook(int bookId) {
            return BookList.getBookInfo(bookId);
        }

        @Override
        public void viewAllBooks() {
            BookList.displayAllBooks();
        }

        @Override
        public void addMember(Member member) {
            MemberList.addMember(member);
        }

        @Override
        public Member searchMember(int memberId) {
            return MemberList.getMemberInfo(memberId);
        }

        @Override
        public void viewAllMembers() {
            MemberList.displayAllMembers();
        }

        @Override
        public void issueBook(int memberId, int bookId) {
            TransactionList.issueBook(bookId, memberId);
        }
        
        @Override
        public void returnBook(int memberId, int bookId) {
            TransactionList.returnBook(bookId, memberId);
        }
}
/*Q3. For a library management system design BookList, MemberList and Transaction Packages.
Booklist package will have the support to store book information in the list like book id, title ,
total number of copies purchased, and number of copies currently available. One can add book in list
(verifying uniqueness of book id), change the attribute values(particularly, increase/decrease copies purchased,
available as and when required), display particular book information(for a book id) and also total list.
MemberList package will provide the service for maintaining member information.
Member information includes member id(unique), name , DOB, and number of books currently issued to him,
There is a limit on number of books one can have at a point of time(it is same for all members).
Transaction package maintains a list of transaction. A transaction entry in the list keeps member id,
book id of the book being issued. Supports are to be provided to modify the entries.
An entry with member id 'xxxx' can be used for adding a new entry.

Using the packages , develop a system that can do the following :
i) add new book in booklist, ii) Add more copies for a book, iii) Show all book details,
iv) show details of a book, v) Add member in the list, vi) show all members, vii) show details of a member,
viii) Issue a book(check book validity and availability, check member validity and eligibility to get a book,
once passes through the validations add an entry into transaction list and update counts in corresponding
booklist and memberlist entries), ix) return a book(check the validity of corresponding issue with book id
and member id and once passes through the validations update the transaction entry by marking member id
as 'xxxx' and update counts in corresponding booklist and memberlist entries).

Consider the list as arrays . While working with arrays it is to be ensured that the use of indices
out of the range is reported in JAVA

 Q4. consider the packages designed in previous question. Design an interface to ensure that the
library management must have the option i) add book , ii) search book, iii) view all book, iv) add member,
 v) search a member, vii) view all members, viii) issue book, ix)return book
*/

