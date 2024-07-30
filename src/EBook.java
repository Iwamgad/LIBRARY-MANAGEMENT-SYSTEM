public class EBook extends Book {


    private Long fileSize;

    public EBook() {
        this.fileSize = fileSize;
    }

    public EBook(String title, String author, String ISBN, boolean isBorrowed, Long fileSize) {
        super(title, author, ISBN, isBorrowed);
        this.fileSize = fileSize;
    }

    public Long getFileSize() {
        return fileSize;
    }

    public void setFileSize(Long fileSize) {
        this.fileSize = fileSize;
    }

    @Override
    public void displayDetails(){
        String status = (isBorrowed() == true) ? ("Borrowed"):("Available");
        System.out.println("[Title: " + getTitle() + ", Author: " + getAuthor() + ", ISBN: " + getISBN() + ", Status: " + status + ", File Size: " + getFileSize() + "]");
    }

}
