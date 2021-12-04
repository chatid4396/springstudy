package com.transaction.service;

import com.transaction.bean.User;
import com.transaction.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class UserServiceImpl {

    @Autowired
    UserDao userDao;

    public User select(String id) {
        return userDao.select(id);
    }

}
