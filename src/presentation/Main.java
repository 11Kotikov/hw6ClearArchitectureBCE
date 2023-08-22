package presentation;

import data.BookRepository;
import data.InMemoryBookRepository;
import domain.Book;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        BookRepository sciFiLibrary = new InMemoryBookRepository();

        Book flowersForAlgernon = new Book("1", "Flowers For Algernon", "Daniel Keyes", 3.50);
        Book theNakedSun = new Book("2", "The Naked Sun", "Isaac Asimov", 5.80);

        sciFiLibrary.addBook(flowersForAlgernon);
        sciFiLibrary.addBook(theNakedSun);

        List <Book> allBooks = sciFiLibrary.showAllLibrary();
        for (Book book : allBooks) {
            System.out.println("Книга: " + book.getTitle() + ", Автор: " + book.getAuthor() + ", Цена: $" + book.getPrice());
        }
    }
}