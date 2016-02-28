package ross.person;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author Ross Rowe
 */
@Repository
public interface PersonRepository extends JpaRepository<Person, Long>  {
    /**
     *
     * @param email
     * @return
     */
    Person findOneByEmail(String email);
}
