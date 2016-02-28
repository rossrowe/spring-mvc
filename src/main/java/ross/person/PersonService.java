package ross.person;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Service;

/**
 * @author Ross Rowe
 */
@Service("personService")
@Scope(proxyMode = ScopedProxyMode.TARGET_CLASS)
public class PersonService {

    @Autowired
    private PersonRepository personRepository;

}
