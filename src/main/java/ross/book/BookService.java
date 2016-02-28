package ross.book;

import ross.person.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Service;

/**
 * @author Ross Rowe
 */
@Service
@Scope(proxyMode = ScopedProxyMode.TARGET_CLASS)
public class BookService {


    @Autowired
    private BookRepository bookRepository;

    @Autowired
    private PersonRepository personRepository;

}
