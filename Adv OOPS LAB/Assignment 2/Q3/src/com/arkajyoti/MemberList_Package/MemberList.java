package Q3.src.com.arkajyoti.MemberList_Package;


public class MemberList {
    private static Member[] members = new Member[50];
    private static int memberCount = 0;

    public static boolean validMember(int memberId) {
        for (Member m : members) {
            if (m!=null && m.getMemberId() == memberId) return true;
        }
        return false;
    }

    public static void addMember(Member m) {
        if (!validMember(m.getMemberId())) members[memberCount++] = m;
        else System.out.println("Can't Add Member, Member Already exists !!!");
    }

    public static boolean checkEligibility(int memberId) {
        for (Member m : members) {
            if (m.getMemberId() == memberId) {
                if (m.getNoOfIssuedBooks() == Member.getMaxBooks()) return false;
                else break;
            }
        }
        return true;
    }
    public static void updateBooks(int memberId, int books, boolean returned) {
        for (Member m : members) {
            if (m.getMemberId() == memberId) {
                m.updateIssuedBooks(books,returned);
                break;
            }
        }
    }
    public static void displayAllMembers() {
        int i=1;
        System.out.println("------>>>  All Members ------>>>");
        for (Member m : members) {
            if(m!=null) {
                System.out.println("           Member " + i);
                m.showMemberInfo();
                i++;
                System.out.println("");
            }
        }
        System.out.println("------------------------------------------");
    }
    public static Member getMemberInfo(int memberId) {
        Member member=null;
        for (Member m : members) {
            if (m.getMemberId() == memberId) {
                m.showMemberInfo();
                member=m;
                break;
            }
        }
        return member;
    }
}

