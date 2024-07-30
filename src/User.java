import java.util.ArrayList;

public class User {


    //    Attributes

    private String name;
    private Long userID;
    private ArrayList<Book> borrowedBooks = new ArrayList<Book>();

    // Constructors


    public User() {
    }

    public User(String name, Long userID) {
        this.name = name;
        this.userID = userID;
    }

    // Getters and setters


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getUserID() {
        return userID;
    }

    public void setUserID(Long userID) {
        this.userID = userID;
    }

    public ArrayList<Book> getBorrowedBooks() {
        return borrowedBooks;
    }

    public void setBorrowedBooks(ArrayList<Book> borrowedBooks) {
        this.borrowedBooks = borrowedBooks;
    }

    public void addBook(Book book){

        this.borrowedBooks.add(book);

    }


    public void borrowBook(Book book){
//        Book bookTrial = new Book()
        if (book.isBorrowed() == false) {
            addBook(book);
            book.borrowBook();
        } else {
            System.out.println("The book is already borrowed by another user, borrow another book !");
        }
    }

    public void returnBook(Book book){
        if (book.isBorrowed() == true) {
            book.returnBook();

            for (int i = 0; i < getBorrowedBooks().size(); i++) {
                if(getBorrowedBooks().get(i).getISBN() == book.getISBN()) getBorrowedBooks().remove(i);
            }

        }
    }

    public void displayBorrowedBooks(){
        System.out.print(this.name + " Borrowed these books: ");
        System.out.print("{");

        for (int i = 0; i < getBorrowedBooks().size(); i++) {
           if(getBorrowedBooks().get(i).isBorrowed() == true) System.out.print(getBorrowedBooks().get(i).getTitle());
           System.out.print(" ");
        }

        System.out.print("}");

    }



}
