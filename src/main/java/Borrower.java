import java.util.ArrayList;

public class Borrower {
    private String name;
    private ArrayList<Book> booksBorrowed;

    public Borrower(String name){
        this.name = name;
        this.booksBorrowed = new ArrayList<Book>();
    }

    public String name(){
        return this.name;
    }
    public int bookCount(){
        return this.booksBorrowed.size();
    }

    public void borrowBook(Book book, Library library){
        library.removeBook(book);
        this.booksBorrowed.add(book);
    }

}
 