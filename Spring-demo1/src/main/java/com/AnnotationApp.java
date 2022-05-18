package com;

import com.config.SpringConfig;
import com.dao.BookDao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AnnotationApp {
    public static void main(String[] args) {
        ApplicationContext app=new AnnotationConfigApplicationContext(SpringConfig.class);

        BookDao bean = app.getBean(BookDao.class);
        bean.save();
    }
}
