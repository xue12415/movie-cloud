package com.movie.client.service;

import com.movie.common.entity.User;

import javax.servlet.http.HttpServletRequest;

/**
 * @Author xue
 * @Date 2020/6/28 10:59
 * @Version 1.0
 * Buddha bless, never bug!
 */
public interface UserService {
    public boolean addUser(User user);
    boolean login(String email, String password, HttpServletRequest request);
}
