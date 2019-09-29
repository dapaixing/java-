public class Book {
    public int ISBN;
    public String name;
    public String bookName;
    public int price;
    public int sales;
    public int comment;

    public Book(int ISBN, String name, String bookName, int price, int sales, int comment) {
        this.ISBN = ISBN;
        this.name = name;
        this.bookName = bookName;
        this.price = price;
        this.sales = sales;
        this.comment = comment;
    }
}
