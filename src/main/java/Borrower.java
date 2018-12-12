import java.util.ArrayList;

public class Borrower {
    private String name;
    private ArrayList<Book> borrowerCollection;


    public Borrower(String name) {
        this.name = name;
        this.borrowerCollection = new ArrayList<Book>();
    }


    public int getCollection() {
        return this.borrowerCollection.size();
    }

    public void addBook(Book book, Library library) {
            this.borrowerCollection.add(book);
            library.capacity ++;
            library.collection.remove(0);
    }


}
