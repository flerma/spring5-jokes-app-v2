package guru.springframework.jokes.controllers;

import guru.springframework.jokes.services.JokesService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author flerma
 */
@Controller
public class JokeController {

    private final JokesService jokesGeneratorService;

    public JokeController(JokesService jokesGeneratorService) {
        this.jokesGeneratorService = jokesGeneratorService;
    }

    @RequestMapping
    public String getJoke(Model model) {
        model.addAttribute("joke", jokesGeneratorService.getJoke());
        return "index/index";
    }


}
