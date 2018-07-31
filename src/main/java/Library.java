import java.util.ArrayList;


//====================================================

public class Library {
    private String address;
    private ArrayList<Book> collection;

//INIT
    public Library(){
        this.collection = new ArrayList<Book>();
        this.address = "Leith";
    }


//METHODS
    public int bookCount(){
        return this.collection.size();
    }

}
