public class Book {
    protected String title;
    protected int publicationYear;
    protected Author author;

    public Book(String title, int publicationYear, Author author) {
        this.title = title;
        this.publicationYear = publicationYear;
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public int getPublicationYear() {
        return publicationYear;
    }

    public Author getAuthor() {
        return author;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setPublicationYear(int publicationYear) {
        this.publicationYear = publicationYear;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public void showDetails() {
        System.out.println("titulo" + title + "\nano de publicação:" + publicationYear + "\nautor:" + author);
    }

}
