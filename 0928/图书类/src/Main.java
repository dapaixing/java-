import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Book> books = new ArrayList<>();
        books.add(new Book(201909,"张玉玉","李明健养成记",20,100,100));
        books.add(new  Book(201919,"李明健","张玉玉养成记",30,150,150));
        List<Book> copy;
        System.out.println("按ISBN排序");
        copy = new ArrayList<>(books);
        Sort.sort(copy)


    }
}
