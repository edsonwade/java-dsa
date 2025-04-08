package code.vanilson.builder;

import lombok.Getter;

import java.util.Objects;

/**
 * Book
 *
 * @author vamuhong
 * @version 1.0
 * @since 2025-04-02
 */
@Getter
public class Book {
    private final String title;
    private final long isbn;
    private final String author;
    private final String publisher;
    private final BookGenre genre;
    private final int pages;

    public Book(BookBuilder builder) {
        this.title = builder.title;
        this.isbn = builder.isbn;
        this.author = builder.author;
        this.publisher = builder.publisher;
        this.genre = builder.genre;
        this.pages = builder.pages;
    }

    static class BookBuilder {
        private String title;
        private long isbn;
        private String author;
        private String publisher;
        private BookGenre genre;
        private int pages;

        public BookBuilder setTitle(String title) {
            this.title = title;
            return this;
        }

        public BookBuilder setIsbn(long isbn) {
            this.isbn = isbn;
            return this;
        }

        public BookBuilder setAuthor(String author) {
            this.author = author;
            return this;
        }

        public BookBuilder setPublisher(String publisher) {
            this.publisher = publisher;
            return this;
        }

        public BookBuilder setGenre(BookGenre genre) {
            this.genre = genre;
            return this;
        }

        public BookBuilder setPages(int pages) {
            this.pages = pages;
            return this;
        }

        public static BookBuilder builder() {
            return new BookBuilder();
        }

        public Book build() {
            return new Book(this);
        }
    }

    @Override
    public final boolean equals(Object o) {
        if (this == o) {return true;}
        if (!(o instanceof Book)) {return false;}

        Book book = (Book) o;
        return isbn == book.isbn && pages == book.pages && Objects.equals(title, book.title) &&
                Objects.equals(author, book.author) && Objects.equals(publisher, book.publisher) &&
                genre == book.genre;
    }

    @Override
    public int hashCode() {
        int result = Objects.hashCode(title);
        result = 31 * result + Long.hashCode(isbn);
        result = 31 * result + Objects.hashCode(author);
        result = 31 * result + Objects.hashCode(publisher);
        result = 31 * result + Objects.hashCode(genre);
        result = 31 * result + pages;
        return result;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", isbn=" + isbn +
                ", author='" + author + '\'' +
                ", publisher='" + publisher + '\'' +
                ", genre=" + genre +
                ", pages=" + pages +
                '}';
    }
}