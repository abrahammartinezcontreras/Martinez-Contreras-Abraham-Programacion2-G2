package desafio;

public class Main {
    public static void main(String[] args) {
        
        Author author = new Author("Gabriel García Márquez");
       
        Book book1 = new Book("Cien Años de Soledad", author, 25.99);
        author.addBook(book1); 

        author.addBook("El Amor en los Tiempos del Cólera", 20.50); 
       
        author.displayBooks();
    }
}
