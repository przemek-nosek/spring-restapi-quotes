package pl.java.springrest.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.java.springrest.client.QuoteClient;
import pl.java.springrest.model.Quote;

import java.util.List;

@Service
@SuppressWarnings("unchecked")
public class QuoteServiceImpl implements QuoteService {

    private final QuoteClient quoteClient;

    @Autowired
    public QuoteServiceImpl(QuoteClient quoteClient) {
        this.quoteClient = quoteClient;
    }

    @Override
    public Quote getRandomQuote() {
        return quoteClient.getRandomQuote();
    }

    @Override
    public List<Quote> get10RandomQuotes() {
        return quoteClient.get10RandomQuotes();
    }

    @Override
    public List<Quote> getQuoteFromAnimeTitle(String title) {
        return quoteClient.getQuoteFromAnimeTitle(title);
    }

    @Override
    public List<Quote> getQuoteFromAnimeCharacter(String character) {
        return quoteClient.getQuoteFromAnimeCharacter(character);
    }

    @Override
    public List<String> getAvailableAnimes() {
        return quoteClient.getAvailableAnimes();
    }

    @Override
    public List<Quote> getAnimeQuotesWithPagination(String title, int page) {
        return quoteClient.getAvailableAnimesWithPagination(title, page);
    }

    @Override
    public List<Quote> getCharacterQuotesWithPagination(String character, int page) {
        return quoteClient.getCharacterQuotesWithPagination(character, page);
    }


}
