package com.movie.user.service;

import com.movie.common.entity.User;
import com.movie.user.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author xue
 * @date 2020-06-22 16:49
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper mapper;

    @Override
    public User getUserById(Integer id) {
        return mapper.selectUserById(id);
    }
}
