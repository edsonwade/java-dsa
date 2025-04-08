package code.vanilson.builder;

/**
 * Main
 *
 * @author vamuhong
 * @version 1.0
 * @since 2025-04-02
 */
public class Main {

    public static void main(String[] args) {
        Test test = new Test();

        System.out.println(test);

        Book book1 = Book.BookBuilder
                .builder()
                .setTitle("O Senhor dos Anéis")
                .setIsbn(9780261103573L)
                .setAuthor("J.R.R. Tolkien")
                .setPublisher("HarperCollins")
                .setGenre(BookGenre.FANTASY)
                .setPages(1216)
                .build();
// Segundo livro
        Book book2 = new Book.BookBuilder()
                .setTitle("Sapiens: Uma Breve História da Humanidade")
                .setIsbn(9780099590088L)
                .setAuthor("Yuval Noah Harari")
                .setPublisher("Harvill Secker")
                .setGenre(BookGenre.NON_FICTION)
                .setPages(464)
                .build();

        // Terceiro livro
        Book book3 = new Book.BookBuilder()
                .setTitle("O Código Da Vinci")
                .setIsbn(9780307474278L)
                .setAuthor("Dan Brown")
                .setPublisher("Doubleday")
                .setGenre(BookGenre.MYSTERY)
                .setPages(489)
                .build();

        // Quarto livro
        Book book4 = new Book.BookBuilder()
                .setTitle("1984")
                .setIsbn(9780451524935L)
                .setAuthor("George Orwell")
                .setPublisher("Signet Classics")
                .setGenre(BookGenre.FICTION)
                .setPages(328)
                .build();

        System.out.println("Books title: " + book1.getTitle());
        System.out.println("Books 2: " + book2);
        System.out.println("Books 3: " + book3);
        System.out.println("Books 4: " + book4);
    }
}