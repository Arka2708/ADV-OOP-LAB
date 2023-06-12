package Q3.src.com.arkajyoti.TransactionList_Package;

public class Transaction {
    private int memberId,bookId;
    boolean isReturned;

    int getBookId(){ return bookId;}
    int getMemberId(){ return memberId; }
    public Transaction(int memberId, int bookId, boolean Returned){
        this.memberId=memberId; this.bookId=bookId ; this.isReturned=Returned;
    }
    void updateReturnedStatus(boolean status){
        this.isReturned=status;
    }
}
