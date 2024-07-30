public class Book {

//    Attributes


    private String title;
    private String author;
    private String ISBN;
    private boolean isBorrowed;

//    Constructors


    public Book() {

    }


    public Book(String title, String author, String ISBN, boolean isBorrowed) {
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
        this.isBorrowed = isBorrowed;
    }

//    Getters and setters

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public boolean isBorrowed() {
        return isBorrowed;
    }

    public void setBorrowed(boolean borrowed) {
        isBorrowed = borrowed;
    }


//    Methods

    public void borrowBook() {
        setBorrowed(true);
    }

    public void returnBook(){

        setBorrowed(false);
    }

    public void displayDetails(){


        String status = (isBorrowed() == true) ? ("Borrowed"):("Available");
        System.out.println("[Title: " + getTitle() + ", Author: " + getAuthor() + ", ISBN: " + getISBN() + ", Status: " + status + "]");
    }


}
