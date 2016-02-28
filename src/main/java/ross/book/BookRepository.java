package ross.book;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author Ross Rowe
 */
@Repository
public interface BookRepository extends JpaRepository<Book, Long> {
}
