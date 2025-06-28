package com.example.service;

import org.springframework.stereotype.Service;

@Service
public class BookService {
    public String getBook(String id) {
        if ("1".equals(id)) return "Book 1";
        throw new RuntimeException("Book not found");
    }
}