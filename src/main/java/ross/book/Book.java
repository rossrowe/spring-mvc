package ross.book;

import ross.person.Person;

import javax.persistence.*;

/**
 * @author Ross Rowe
 */
@Entity
@Table(name = "book")
public class Book {

    @Id
    @GeneratedValue
    private Long id;

    @Column
    private String isbn;

    @Column
    private String author;

    @Column
    private String title;

    @ManyToOne(fetch = FetchType.EAGER)
    private Person borrower;

    protected Book() {

    }

    public Book(String title, String author, String isbn, Person borrower) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.borrower = borrower;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }
}
