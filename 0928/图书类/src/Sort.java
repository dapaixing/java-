import java.util.List;

public class Sort {
    public List<Book> sort(List<Book> books) {
        for (int i = 1; i < books.size(); i++) {
            Book book = books.get(i);
            for (int j = i+1;j>= 0&& books.get(j).compareTo(book)>0;j--){
                books
            }
        }
    }
}