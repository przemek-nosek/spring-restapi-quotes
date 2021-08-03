package pl.java.springrest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import pl.java.springrest.model.Quote;
import pl.java.springrest.service.QuoteService;

import java.util.List;

@RestController
@SuppressWarnings("unchecked")
public class QuoteController {

    private final QuoteService quoteService;

    @Autowired
    public QuoteController(QuoteService quoteService) {
        this.quoteService = quoteService;
    }


    @GetMapping("/quotes")
    public Quote getRandomQuote() {
        return quoteService.getRandomQuote();
    }

    @GetMapping("/quotes/10")
    public List<Quote> get10RandomQuotes() {
        return quoteService.get10RandomQuotes();
    }

    @GetMapping("/animes")
    public List<String> getAvailableAnimes() {
        return quoteService.getAvailableAnimes();
    }

    @GetMapping("/animes/{title}/{page}")
    public List<Quote> getAnimeQuotesWithPagination(@PathVariable("title") String title, @PathVariable("page") int page) {
        return quoteService.getAnimeQuotesWithPagination(title, page);
    }

    @GetMapping("/quotes/{character}/{page}")
    public List<Quote> getCharacterQuotesWithPagination(@PathVariable("character") String character, @PathVariable("page") int page) {
        return quoteService.getCharacterQuotesWithPagination(character, page);
    }



    @GetMapping("/quotes/anime/{title}")
    public List<Quote> getQuoteFromAnimeTitle(@PathVariable("title") String title) {
        return quoteService.getQuoteFromAnimeTitle(title);
    }

    @GetMapping("/quotes/{character}")
    public List<Quote> getQuoteFromAnimeCharacter(@PathVariable("character") String character) {
        return quoteService.getQuoteFromAnimeCharacter(character);
    }
}
