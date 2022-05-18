package com.service.impl;

import com.dao.BookDao;
import com.dao.impl.BookDaoImpl;
import com.service.BookService;

public class BookServiceImpl implements BookService {
    private BookDao bookDao;
    public void save() {
        System.out.println("Book Service save ...");
        bookDao.save();
    }

    public void setBookDao(BookDaoImpl bookDao) {
        this.bookDao=bookDao;
    }
}
