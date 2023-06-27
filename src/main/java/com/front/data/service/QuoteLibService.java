package com.front.data.service;

import com.front.data.client.QuoteLibClient;
import com.front.data.domain.QuoteLibDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class QuoteLibService {

    private final QuoteLibClient quoteLibClient;

    public List<QuoteLibDto> fetchRandomQuote() {
        return quoteLibClient.getRandomQuote();
    }
}
