package pl.java.springrest.service;


import pl.java.springrest.model.Quote;

import java.util.List;

public interface QuoteService {

    Quote getRandomQuote();

    List<Quote> get10RandomQuotes();

    List<Quote> getQuoteFromAnimeTitle(String title);

    List<Quote> getQuoteFromAnimeCharacter(String character);

    List<String> getAvailableAnimes();

    List<Quote> getAnimeQuotesWithPagination(String title, int page);

    List<Quote> getCharacterQuotesWithPagination(String character, int page);
}
