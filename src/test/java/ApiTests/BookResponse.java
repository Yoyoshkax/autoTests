package ApiTests;

import java.util.List;

public class BookResponse {
    public List<BookData> books;

    public void setBooks(List<BookData> books) {
        this.books = books;
    }

    public List<BookData> getBooks() {
        return books;
    }
}
