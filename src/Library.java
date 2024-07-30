import java.util.ArrayList;

public class Library {

//    Attributes

    private ArrayList<Book> books = new ArrayList<Book>();
    private ArrayList<User> users = new ArrayList<User>();

    public Library() {
    }

    public Library(ArrayList<Book> books, ArrayList<User> users) {
        this.books = books;
        this.users = users;
    }


    public ArrayList<Book> getBooks() {
        return books;
    }

    public void setBooks(ArrayList<Book> books) {
        this.books = books;
    }

    public ArrayList<User> getUsers() {
        return users;
    }

    public void setUsers(ArrayList<User> users) {
        this.users = users;
    }

    public void addBook(Book book){
        this.books.add(book);
    }

    public void addUser(User user){
       this.users.add(user);
    }


    public void listAvailableUsers(){
        for (int i = 0; i < getUsers().size(); i++) {
            System.out.println(getUsers().get(i).getName());
        }
    }

    public void listAvailableBooks(){
        for (int i = 0; i < getBooks().size(); i++) {
            if(getBooks().get(i).isBorrowed() == false) System.out.println(getBooks().get(i).getTitle());
        }
    }

    public void findBookByISBN(String ISBN){
        for (int i = 0; i < getBooks().size(); i++) {
            if(getBooks().get(i).getISBN() == ISBN) System.out.println(getBooks().get(i));
        }
    }
}
