package desafio;

import java.util.ArrayList;
import java.util.List;

public class Author {
    private String name;
    private List<Book> books;

    // Constructor que inicializa el nombre del autor
    public Author(String name) {
        this.name = name;
        this.books = new ArrayList<>();
    }

    // Método para agregar un libro a la lista usando un objeto Book
    public void addBook(Book book) {
        books.add(book);
        System.out.println("Libro '" + book.getTitle() + "' agregado a " + name);
    }

    // Sobrecarga del método addBook: agrega un libro usando título y precio
    public void addBook(String title, double price) {
        Book book = new Book(title, this, price); // Crea un nuevo libro con el autor actual
        books.add(book);
        System.out.println("Libro '" + title + "' agregado a " + name);
    }

    // Método para obtener la lista de libros del autor
    public List<Book> getBooks() {
        return books;
    }

    // Método para obtener el nombre del autor
    public String getName() {
        return name;
    }

    // Método para mostrar la información del autor y sus libros
    public void displayBooks() {
        System.out.println("Autor: " + name);
        for (Book book : books) {
            System.out.println(" - " + book.getTitle() + " ($" + book.getPrice() + ")");
        }
    }
}