public class DigitalBook extends Book {

    double fileLength;

    public DigitalBook(String title, int publicationYear, Author author, double fileLength) {
        super(title, publicationYear, author);
        this.fileLength = fileLength;
    }

    public double getFileLength() {
        return fileLength;
    }

    public void setFileLength(double fileLength) {
        this.fileLength = fileLength;
    }

    @Override
    public void showDetails() {
        System.out
                .println(
                        "titulo" + title + "\nano de publicação:" + publicationYear + "\nautor:" + author.getName()
                                + " " + author.getNationality()
                                + "\ntamanho do arquivo" + fileLength + "Mb.");
    }
}
