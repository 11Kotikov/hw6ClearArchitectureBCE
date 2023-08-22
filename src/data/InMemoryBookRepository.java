package data;

import domain.Book;

import java.util.ArrayList;
import java.util.List;

public class InMemoryBookRepository implements BookRepository{
    private List<Book> library;

    public InMemoryBookRepository() {
        library = new ArrayList<>();
    }

    @Override
    public void addBook(Book book) {
        library.add(book);
    }

    @Override
    public void removeBook(Book book) {
        library.remove(book);
    }

    @Override
    public List<Book> showAllLibrary() {
        return new ArrayList<>(library);
    }

}
