import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        Book bookOne = new Book("BookOne", "J.K. rowling", "123478888L", false);

        Book bookTwo = new Book("BookTwo", "Sydney Sheldon", "456789387", false);

        Book bookThree = new Book("BookThree", "ken", "55667059484", false);

        Book bookFour = new Book("BookFour", "George", "99083848374", false);

        Book bookFive = new Book("BookFive", "Will", "813437575723", false);

        Book bookSix = new Book("BookSix", "Smith", "725723592358", false);

        Book bookSeven = new Book("BookSeven", "Bigshot", "2923852752725", false);

        Book bookEight = new Book("BookEight", "Elen", "235899284582", false);

        Book bookNine = new Book("BookNine", "Emy", "85925372375723", false);


// Book class check

//        bookOne.borrowBook();
//        System.out.println(bookOne.isBorrowed());
//        bookOne.returnBook();
//        System.out.println(bookOne.isBorrowed());
//        bookOne.displayDetails();

//        User class check

        User userOne = new User("Nati", 1L);
        User userTwo = new User("Abel", 2L);
        User userThree = new User("Hannan", 3L);
        User userFour = new User("Dagi", 4L);

//        System.out.println(bookOne.isBorrowed());
        userOne.borrowBook(bookOne);
//        System.out.println(bookOne.isBorrowed());
        userOne.borrowBook(bookTwo);
        userOne.returnBook(bookTwo);
        userOne.borrowBook(bookThree);
        userOne.borrowBook(bookFive);
        userTwo.borrowBook(bookSix);



        userOne.displayBorrowedBooks();
        System.out.println(" ");
        userTwo.displayBorrowedBooks();
        userTwo.borrowBook(bookNine);
        System.out.println(" ");
        userTwo.displayBorrowedBooks();
        System.out.println(" ");
        userThree.borrowBook(bookNine);
        userThree.displayBorrowedBooks();

//        System.out.println(bookTwo.isBorrowed());

//        System.out.println(userOne.getBorrowedBooks());
//        userOne.getBorrowedBooks();


//        Library class check
        System.out.println();
        Library library = new Library();

        library.addBook(bookOne);
        library.addBook(bookTwo);
        library.addBook(bookThree);
        library.addBook(bookFour);
        library.addBook(bookFive);
        library.addBook(bookSix);
        library.addBook(bookSeven);
        library.addBook(bookEight);
        library.addBook(bookNine);

        library.listAvailableBooks();

        System.out.println();

        userOne.returnBook(bookOne);

        library.listAvailableBooks();


        library.addUser(userOne);
        library.addUser(userTwo);
        library.addUser(userThree);
        library.addUser(userFour);

        library.listAvailableUsers();





//        User userOne = new User();
//        library.addUser(userOne);
//
//        userOne.addBook(bookOne);
//        userOne.addBook(bookThree);
//        userOne.returnBook(bookOne);
//
//        userOne.displayBorrowedBooks();






//        System.out.println(library.getBooks());
//        library.listAvailableBooks();
//        library.findBookByISBN("123478888L");
//        library.listAvailableBooks();

        Book ebook = new EBook();



        ebook.displayDetails();










    }
}
