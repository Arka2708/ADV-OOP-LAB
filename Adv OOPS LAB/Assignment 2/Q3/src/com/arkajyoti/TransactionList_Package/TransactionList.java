package Q3.src.com.arkajyoti.TransactionList_Package;


import Q3.src.com.arkajyoti.BookList_Package.BookList;
import Q3.src.com.arkajyoti.MemberList_Package.MemberList;

public class TransactionList {
    private static Transaction[] transactions = new Transaction[300];
    private static int transactionCount = 0;

    public static void addTransaction(Transaction t) {
      transactions[transactionCount++]=t;
      BookList.updateCopies(t.getBookId(),1,false );
      MemberList.updateBooks(t.getMemberId(),1,false);
    }

    public static boolean checkTransaction(int bookId, int memberId){
        for(Transaction t: transactions)
            if (t != null && t.getMemberId() == memberId && t.getBookId() == bookId) {
                t.updateReturnedStatus(true);
                return true;
            }
        return false;
    }
    public static void issueBook(int bookId, int memberId){
        if(BookList.validBook(bookId)){
            if(MemberList.validMember(memberId)){
                if(BookList.checkAvailability(bookId)){
                    if(MemberList.checkEligibility(memberId)){
                        addTransaction(new Transaction(memberId,bookId,false));
                        System.out.println("");
                        System.out.println("Member ID :" + memberId + "   Book ID :" + bookId);
                        System.out.println("Book Issued!");
                        System.out.println("");
                    }
                    else System.out.println("The member has already issued max no of books, Return book first!");
                }
                else System.out.println("The Book is currently unavailable!");
            }
            else System.out.println("Invalid Member! give correct Member ID");
        }
        else System.out.println("The Book ID is not valid!");
    }
    public static void returnBook(int bookId, int memberId){
        if(checkTransaction(bookId,memberId)){
            BookList.updateCopies(bookId,1,true);
            MemberList.updateBooks(memberId,1,true);
            System.out.println("");
            System.out.println("Member ID :" + memberId + "   Book ID :" + bookId);
            System.out.println("Book Returned!");
            System.out.println("");
        }
    }
}
