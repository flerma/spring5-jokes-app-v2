package guru.springframework.chucknorrisjokes;

import guru.springframework.chucknorrisjokes.service.JokesGeneratorService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author flerma
 */
@Controller
public class JokeController {

    private final JokesGeneratorService jokesGeneratorService;

    public JokeController(JokesGeneratorService jokesGeneratorService) {
        this.jokesGeneratorService = jokesGeneratorService;
    }

    @RequestMapping
    public String getJoke(Model model) {
        model.addAttribute("joke", jokesGeneratorService.getRandonJoke());
        return "index/index";
    }


}
