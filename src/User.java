public class User {


    private String name;
    private Long userID;
    private Book borrowedBooks;

    public User() {
    }

    public User(String name, Long userID, Book borrowedBooks) {
        this.name = name;
        this.userID = userID;
        this.borrowedBooks = borrowedBooks;
    }


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

    public Book getBorrowedBooks() {
        return borrowedBooks;
    }

    public void setBorrowedBooks(Book borrowedBooks) {
        this.borrowedBooks = borrowedBooks;
    }


}
