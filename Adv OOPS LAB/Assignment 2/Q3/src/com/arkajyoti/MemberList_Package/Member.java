package Q3.src.com.arkajyoti.MemberList_Package;

public class Member {
    private String name, DOB;
    private int memberId;
    private int noOfIssuedBooks;
    private static final int maxBooks = 5;

    public Member(int memberId, String name, String DOB) {
        this.memberId=memberId; this.name=name; this.DOB=DOB;
    }

    public int getMemberId(){
        return memberId;
    }
    public static int getMaxBooks(){
        return maxBooks;
    }
    int getNoOfIssuedBooks(){ return noOfIssuedBooks;}
    void showMemberInfo(){
        System.out.println("      *****Member INFO*****      ");
        System.out.println("Name :" + name);
        System.out.println("Member Id : " + memberId);
        System.out.println("Date of Birth: " + DOB);
        System.out.println("No. of Books Currently Issued : " + noOfIssuedBooks);
        System.out.println("Max no. of books can be issued : " + maxBooks);
    }
    void updateIssuedBooks(int books, boolean returned)
    {
        if(returned)this.noOfIssuedBooks-=books;
        else this.noOfIssuedBooks+=books;
    }

    public String getName() {
        return this.name;
    }
}
