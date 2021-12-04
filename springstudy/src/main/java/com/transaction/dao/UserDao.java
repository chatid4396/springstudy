package com.transaction.dao;

import com.transaction.bean.User;
import org.apache.ibatis.annotations.Mapper;

public interface UserDao {
    User select(String id);
}
