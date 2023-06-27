package com.front.data.service;

import com.front.data.client.OpenLibraryClient;
import com.front.data.domain.ResultBookDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class OpenLibraryService {

    private final OpenLibraryClient openLibraryClient;

    public List<ResultBookDto> fetchBooksByAuthor(String keyword) {
        return openLibraryClient.getBooksByAuthor(keyword);
    }

    public List<ResultBookDto> fetchBooksByTitle(String keyword) {
        return openLibraryClient.getBooksByTitle(keyword);
    }
}