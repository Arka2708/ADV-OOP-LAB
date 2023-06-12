package Q3.src.com.arkajyoti.BookList_Package;

public class BookList {
    private static Book[] books = new Book[200];
    private static int bookCount = 0;

        public static boolean validBook(int bookId) {
            for (Book b : books) {
                if (b!=null && b.getBookId() == bookId) {
                    return true;
                }
            }return false;
        }
        public static void addBook(Book b) {
            if(!validBook(b.getBookId())) books[bookCount++] = b;
            else System.out.println("Can't Add Book, Book Already exists !!!");
        }
        public static boolean checkAvailability(int bookId) {
            for (Book b : books) {
                if (b.getBookId() == bookId) {
                    if(b.getAvailableCopies()>0) return true;
                    else break;
                }
            }
            return false;
        }
        public static void updateCopies(int bookId, int copies, boolean returned) {
            for (Book b : books) {
                if (b.getBookId() == bookId) {
                    b.updateAvailableCopies(copies, returned);
                    break;
                }

            }
        }
        public static void displayAllBooks() {
            int i=1;
            System.out.println("------>>>  All Books ------>>>");
            for (Book b : books) {
                if(b!=null) {
                    System.out.println("           Book " + i);
                    b.displayBookInfo();
                    i++;
                    System.out.println("");
                }
            }
            System.out.println("------------------------------------------");
        }
       public static Book getBookInfo(int bookId) {
            Book book = null;
           for (Book b : books) {
               if (b.getBookId() == bookId) {
                   b.displayBookInfo();
                   book=b;
                   break;
               }
           }
           return book;
       }

}

