import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

//====================================================
public class BorrowerTest {
    Borrower borrower_01;
    Library library_02;
    Book book_01;
    Book book_02;

    @Before
    public void before(){
        borrower_01 = new Borrower("Wojtek");
        library_02 = new Library("Morningside");
        book_01 = new Book("The Element", GenreType.MYSTERY);

        library_02.addBook(book_01);
    }

    @Test
    public void hasName(){
        assertEquals("Wojtek",borrower_01.name());
    }
    @Test
    public void borrowBook(){
        borrower_01.borrowBook(book_01, library_02);
        assertEquals(0, library_02.bookCount());
        assertEquals(1, borrower_01.bookCount());
    }

}