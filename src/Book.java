import java.util.Objects;

public class Book {

    private final String bookName;
    private final Author author;
    private int publishYear;

    public Book(String bookName, Author author, int publishYear) {
        this.bookName = bookName;
        this.publishYear = publishYear;
        this.author = author;
    }
    @Override
    public String toString() {
        return (bookName + " by " + author + " was published in " + publishYear );
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return publishYear == book.publishYear && bookName.equals(book.bookName) && author.equals(book.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bookName, author, publishYear);
    }

    public String getBookName() {
        return bookName;
    }

    public Author getAuthor() {
        return author;
    }

    public int getPublishYear() {
        return publishYear;
    }

    public void setPublishYear(int publishYear) {
        this.publishYear = publishYear;
    }
}
