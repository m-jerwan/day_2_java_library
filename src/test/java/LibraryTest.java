
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

//====================================================


public class LibraryTest {
    Library library_01;
    Book book_01;
    Book book_02;

    @Before
    public void before(){
        library_01 = new Library("Leith");
        book_01 = new Book("The Element", GenreType.MYSTERY);
        book_02 = new Book("Quo Vadis", GenreType.THRILLER);
    }

    @Test
    public void bookCount(){
        assertEquals(0,library_01.bookCount());
    }
    @Test
    public void bookAddingStillRoom(){
        library_01.addBook(book_01);
        assertEquals(1, library_01.bookCount());
    }

    @Test
    public void bookAddingNoRoom(){
        library_01.addBook(book_01);
        boolean msg = library_01.addBook(book_02);
        assertEquals(false, msg);
    }

    @Test
    public void bookRemoving(){
        library_01.addBook(book_01);
        library_01.removeBook(book_01);
        assertEquals(0, library_01.bookCount());
    }
    @Test
    public void checkCapacity(){
        assertEquals(1, library_01.capacity());
    }

    @Test
    public void checkGenre(){
        assertEquals("THRILLER", book_02.checkGenre());
    }

}
