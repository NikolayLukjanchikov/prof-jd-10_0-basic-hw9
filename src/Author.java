public class Author {
    private final String authorName;
    private final String authorSurname;

    public Author(String authorName, String authorSurname) {
        this.authorName = authorName;
        this.authorSurname = authorSurname;
    }
    @Override
    public String toString() {
        return (authorName + " " + authorSurname);
    }
    public String getAuthorName() {
        return authorName;
    }

    public String getAuthorSurname() {
        return authorSurname;
    }
}
