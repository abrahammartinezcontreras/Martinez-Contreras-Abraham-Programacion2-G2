package desafio;

public class Book {
    private String title;
    private Author author;
    private double price;

    // Constructor que inicializa el título, autor y precio del libro
    public Book(String title, Author author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    // Método para obtener el título del libro
    public String getTitle() {
        return title;
    }

    // Método para obtener el precio del libro
    public double getPrice() {
        return price;
    }

    // Método para obtener el nombre del autor
    public String getAuthorName() {
        return author.getName();
    }

    // Método para mostrar la información del libro
    public void getInfo() {
        System.out.println("Título: " + title);
        System.out.println("Autor: " + getAuthorName());
        System.out.println("Precio: $" + price);
    }
}
