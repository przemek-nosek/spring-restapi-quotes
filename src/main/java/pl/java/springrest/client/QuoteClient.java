package pl.java.springrest.client;

import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;
import pl.java.springrest.model.Quote;


import java.util.List;


@Component
@SuppressWarnings("unchecked")
public class QuoteClient  {

    private static final String ANIME_QUOTE_URL = "https://animechan.vercel.app/api/";
    private final RestTemplate restTemplate = new RestTemplate();


    public Quote getRandomQuote() { // random
        return callGetMethod("{random}", Quote.class, "random");
    }

    public List<Quote> get10RandomQuotes() { // quotes
        return callGetMethod("{quotes}", List.class, "quotes");
    }

    public List<Quote> getQuoteFromAnimeTitle(String title) {
        return callGetMethod("quotes/anime?title={title}", List.class, title);
    }

    public List<Quote> getQuoteFromAnimeCharacter(String character) {
        return callGetMethod("quotes/character?name={character}", List.class, character);
    }

    public List<String> getAvailableAnimes() {
        return callGetMethod("available/anime", List.class);
    }


    public List<Quote> getAvailableAnimesWithPagination(String title, int page) {
        return callGetMethod("quotes/anime?title={title}&page={page}", List.class, title, page);
    }


    public List<Quote> getCharacterQuotesWithPagination(String character, int page) {
        return callGetMethod("quotes/character?name={character}&page={page}", List.class, character, page);
    }

    private <T> T callGetMethod(String url, Class<T> responseType, Object... uris) {
        return restTemplate.getForObject(ANIME_QUOTE_URL + url, responseType, uris);
    }

}
