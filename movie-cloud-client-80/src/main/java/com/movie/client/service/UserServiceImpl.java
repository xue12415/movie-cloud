package com.movie.client.service;

import com.movie.client.dao.UserDao;
import com.movie.common.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 * @Author xue
 * @Date 2020/6/28 14:31
 * @Version 1.0
 * Buddha bless, never bug!
 */
@Repository
public class UserServiceImpl implements UserService {
    @Autowired
    UserDao userDao;

    User user;
    @Override
    public boolean addUser(User user) {
        return userDao.addUser(user);
    }

    @Override
    public boolean login(String email, String password) {
        user=userDao.getUserByMail(email);
        if (user.getPassword().equals(password)){
            return true;
        }
        return false;
    }
}
