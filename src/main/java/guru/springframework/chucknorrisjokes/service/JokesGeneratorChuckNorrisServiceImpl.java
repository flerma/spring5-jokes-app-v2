package guru.springframework.chucknorrisjokes.service;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

/**
 * @author flerma
 */
@Primary
@Component
public class JokesGeneratorChuckNorrisServiceImpl implements JokesGeneratorService {

    private final ChuckNorrisQuotes chuckNorrisQuotes;

    public JokesGeneratorChuckNorrisServiceImpl() {
        this.chuckNorrisQuotes = new ChuckNorrisQuotes();
    }

    @Override
    public String getRandonJoke() {
        return this.chuckNorrisQuotes.getRandomQuote();
    }
}
