
import java.util.ArrayList;
import java.util.List;

class Book{
    private int id;
    private String title;
    private String author;
    private int yearPublished;
    private int numberOfPages;

    public  Book(int id, String title, String author, int yearPublished, int numberOfPages){
        this.id=id;
        this.title=title;
        this.author=author;
        this.yearPublished=yearPublished;
        this.numberOfPages=numberOfPages;
    }
    public int getId(){
        return  id;
    }
    public String getTitle(){
        return title;
    }
    public String getAuthor(){
        return author;
    }
    public int getYearPublished(){
        return yearPublished;
    }
    public int getNumberOfPages(){
        return numberOfPages;
    }
    public  String toString(){
        return "Book id: "+id+", title: "+title+", author: "+author+", yearPublished: "+yearPublished+", Number of Pages: "+numberOfPages;
    }
}
class Library{
    List<Book> books = new ArrayList<>();

    public void addBook(Book book){
        books.add(book);
    }
    public List<Book> findBookByAuthor(String author){
        List<Book> bookList = new ArrayList<>();
        for(Book b : books){
            if(b.getAuthor().contains(author)){
                bookList.add(b);
            }
        }
        return bookList;
    }

    public List<Book> findLatestBooks(int year){
        List<Book> latestBooks = new ArrayList<>();
        for(Book b : books){
            if(b.getYearPublished()>year){
                latestBooks.add(b);
            }
        }
        return latestBooks;
    }
    public List<Book> findBooksByComplexCriteria(int year, int minPages, String authorSubstring){
        return books.stream().filter(b->b.getYearPublished()>year).filter(b->b.getNumberOfPages()>=minPages).filter(b->b.getAuthor().contains(authorSubstring)).toList();
    }
}
public class LibraryBookManagement {
    public static void main(String[] args) {
        Library lib = new Library();
        lib.addBook(new Book(111, "Java Book", "Alex Roll", 1995, 650));
        lib.addBook(new Book(121, "Python Book", "Rohit Rihal", 2004, 450));
        lib.addBook(new Book(131, "JavaScript Book", "Sunil Malu", 2011, 415));

        System.out.println(lib.findBookByAuthor("Malu"));
        System.out.println(lib.findLatestBooks(2000));
        System.out.println(lib.findBooksByComplexCriteria(2005, 400, "Malu"));
    }
}

