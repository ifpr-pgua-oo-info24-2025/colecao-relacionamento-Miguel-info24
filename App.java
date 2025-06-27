import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
        ArrayList<Book> library = new ArrayList<>();

        Author author1 = new Author("Machado de Assis", "Brazilian");
        Author author2 = new Author("Robert C. Martin", "American");
        Author author3 = new Author("George Orwell", "British");
        Author author4 = new Author("J. K. Rowling", "British");

        PhysicalBook book1 = new PhysicalBook("Dom Casmurro", 1899, author1, 256);
        PhysicalBook book2 = new PhysicalBook("1984", 1949, author3, 328);
        DigitalBook book3 = new DigitalBook("Clean Code", 2008, author2, 1.5);
        DigitalBook book4 = new DigitalBook("Harry Potter and the Philosopher's Stone", 1997, author4, 2.3);

        library.add(book1);
        library.add(book2);
        library.add(book3);
        library.add(book4);

        for (Book book : library) {
            book.showDetails();
            System.out.println("--------------------------------");
        }
    }
}
