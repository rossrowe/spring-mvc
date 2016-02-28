package ross.book;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.Locale;

/**
 * @author Ross Rowe
 */
@Controller
class BookController {

    private BookRepository bookRepository;

    @Autowired
    public BookController(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String home(Locale locale, Model model) {
        return "redirect:/books";
    }

    @RequestMapping(value = "/books", method = RequestMethod.GET)
    public String init(@ModelAttribute("model") org.springframework.ui.ModelMap model) {
        model.addAttribute("bookList", bookRepository.findAll());
        return "book";
    }

}
