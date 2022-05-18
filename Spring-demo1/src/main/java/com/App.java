package com;

import com.service.BookService;
import com.service.impl.BookServiceImpl;

public class App {
    public static void main(String[] args) {
        BookService bookService=new BookServiceImpl();
        bookService.save();
    }
}
