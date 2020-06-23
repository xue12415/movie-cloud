package com.movie.user.service;

import com.movie.common.entity.User;

/**
 * @author xue
 * @date 2020-06-22 16:48
 */
public interface UserService {
    User getUserById(Integer id);
    Boolean addUser(User user);
}
