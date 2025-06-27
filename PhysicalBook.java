public class PhysicalBook extends Book {

    int pageNumber;

    public PhysicalBook(String title, int publicationYear, Author author, int pageNumber) {
        super(title, publicationYear, author);
        this.pageNumber = pageNumber;
    }

    public int getPageNumber() {
        return pageNumber;
    }

    public void setPageNumber(int pageNumber) {
        this.pageNumber = pageNumber;
    }

    @Override
    public void showDetails() {
        System.out
                .println(
                        "titulo" + title + "\nano de publicação:" + publicationYear + "\nautor:" + author.getName()
                                + " " + author.getNationality()
                                + "\npageNumber" + pageNumber);
    }
}
