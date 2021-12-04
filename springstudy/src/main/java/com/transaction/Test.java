package com.transaction;

import com.transaction.service.UserServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("transaction.xml");

        UserServiceImpl userService = (UserServiceImpl) context.getBean("userServiceImpl");
        userService.select("1");
    }
}
