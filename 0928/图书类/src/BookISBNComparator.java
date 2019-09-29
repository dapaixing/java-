import java.util.Comparator;

public class BookISBNComparator implements Comparator<Book> {


    @Override
    public int compare(Book o1, Book o2) {
        return o1.ISBN - o2.ISBN;
    }
}
