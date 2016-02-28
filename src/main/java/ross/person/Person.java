package ross.person;

import ross.book.Book;

import javax.persistence.*;
import java.util.List;

/**
 * @author Ross Rowe
 */
@Entity
@Table(name = "person")
public class Person {

    @Id
    @GeneratedValue
    private Long id;

    @Column
    private String name;

    @Column(unique = true)
    private String email;

    @OneToMany(fetch = FetchType.EAGER, mappedBy = "borrower")
    private List<Book> booksBorrowed;

    protected Person()
    {
    }

    public Person(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public Long getId() {
        return id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Book> getBooksBorrowed() {
        return booksBorrowed;
    }
}
