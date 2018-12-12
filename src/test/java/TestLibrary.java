import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestLibrary {

    Library library;
    Book book;
    Borrower borrower;

    @Before
    public void before(){
        library = new Library();
        book = new Book("1984", "George Orwell", "Dystopian");
        borrower = new Borrower("Robin");
        library.addBook(book);

        library.addBook(book);
        library.addBook(book);
        library.addBook(book);
        library.addBook(book);
        library.addBook(book);
        library.addBook(book);
        borrower.addBook(book, library);
//        library.addGenreToList(book, library.numberOfGenre() );

    }

    @Test
    public void hasCollection(){
        assertEquals(6, library.getCollection());
    }

    @Test
    public void hasCapacity(){
        assertEquals(4, library.getCapacity());
    }













}