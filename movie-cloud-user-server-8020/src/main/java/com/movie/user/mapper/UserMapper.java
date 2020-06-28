package com.movie.user.mapper;

import com.movie.common.entity.User;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author xue
 * @date 2020-06-22 16:35
 */
@Mapper
public interface UserMapper {
    User selectUserById(Integer id);
    Integer insertUser(User user);
    User selectUserByMail(String mail);
}
