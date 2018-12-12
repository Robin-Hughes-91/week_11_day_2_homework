import java.util.ArrayList;
import java.util.HashMap;

public class Library {
    public ArrayList<Book> collection;
    public int capacity;
    private HashMap<String, Integer> genreList;


    public Library() {
        this.collection = new ArrayList<Book>();
        this.capacity = 10;
        this.genreList = new HashMap<>();
    }

    public int getCollection() {
        return this.collection.size();
    }

    public void addBook(Book book) {
        if (capacity >=1){
            this.collection.add(book);
            capacity --;
        }
    }

    public int getCapacity() {
        return this.capacity;
    }

    public void addGenreToList(Book book, Integer total){
        this.genreList.put(book.genre, total );
    }

    public int checkGenreList(Book book){
        return this.genreList.get(book.genre);

    }

//    public int checkCollectionForGenre(Book book){
//        return this.collection;
//    }











}
