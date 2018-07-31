import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

//====================================================

public class LibraryTest {
    Library library_01;

    @Before
    public void before(){
        Library library_01 = new Library();
    }

    @Test
    public void bookCount(){
        assertEquals(0,library_01.bookCount());
    }

}
