package Q3.src.com.arkajyoti.BookList_Package;

public class Book {

    private String title;
    private int bookId;
    private int noOfCopiesPurchased;
    private int availableCopies;

    public Book(int bookId, String title, int totalCopies) {
        this.bookId = bookId;
        this.title = title;
        this.noOfCopiesPurchased = totalCopies;
        this.availableCopies = totalCopies;
    }

    int getBookId(){
        return bookId;
    }
    public String getName(){
        return title;
    }
    int getAvailableCopies(){
        return availableCopies;
    }
    int getNoOfCopiesPurchased(){
        return noOfCopiesPurchased;
    }
    void addCopies(int newCopies) {
        this.noOfCopiesPurchased+=newCopies;
    }
    void updateAvailableCopies(int copies, boolean Returned) {
        if(!Returned) this.availableCopies-=copies;
        else this.availableCopies+=copies;
    }

    void displayBookInfo(){
        System.out.println("      *****BOOK INFO*****      ");
        System.out.println("Title :" + title);
        System.out.println("Book Id : " + bookId);
        System.out.println("No. of Copies Purchased: " + noOfCopiesPurchased);
        System.out.println("No. of Available Copies: " + availableCopies);
    }
}
