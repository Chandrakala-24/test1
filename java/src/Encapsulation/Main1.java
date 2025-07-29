package Encapsulation;

public class Main1 {
    public static void main(String[] args) {
        Author author = new Author("William Shakespeare", "shakespeare@gmail.com", 'M');
        Book book = new Book();
        book.setName("Romeo and Juliet");
        book.setAuthor(author);  // Set Author object
        book.setPrice(500.0);
        book.setQtyInStock(50);

        System.out.println("Book Details:");
        System.out.println("Name: " + book.getName());
        System.out.println("Author: " + book.getAuthor().getName() + "," +book.getAuthor().getEmail() + "," +
                book.getAuthor().getGender());
        System.out.println("Price: " + book.getPrice());
        System.out.println("Qty In Stock: " + book.getQtyInStock());
    }
}
