package ross.person;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author Ross Rowe
 */
@Controller
public class PersonController {

    private PersonRepository personRepository;

    @Autowired
    public PersonController(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    @RequestMapping(value = "/borrowers", method = RequestMethod.GET)
    public String init(@ModelAttribute("model") org.springframework.ui.ModelMap model) {
        model.addAttribute("personList", personRepository.findAll());
        return "borrowers";
    }

    @RequestMapping(value = "/borrower/listBooks", method = {RequestMethod.POST,RequestMethod.GET})
    public String listBooks(@RequestParam("personId") String personId, @ModelAttribute("model") org.springframework.ui.ModelMap model) {
        Person borrower = personRepository.findOne(Long.parseLong(personId));
        model.addAttribute("borrower", borrower);
        return "booksBorrowed";
    }
}
