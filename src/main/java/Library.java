import java.util.ArrayList;


//====================================================

public class Library {
    private String address;
    private ArrayList<Book> collection;
    private int capacity;

//INIT
    public Library(String address){
        this.collection = new ArrayList<Book>();
        this.address = address;
        this.capacity = 1;
    }


//METHODS

    public int capacity(){
        return this.capacity;
    }

    public int bookCount(){
        return this.collection.size();
    }

    public boolean addBook(Book book){
        if (this.capacity() > 0 ) {
            this.collection.add(book);
            this.capacity -= 1;
            return true;
        }else{
            return false;
        }
    }

    public void removeBook(Book book){
        this.collection.remove(book);
    }



}

