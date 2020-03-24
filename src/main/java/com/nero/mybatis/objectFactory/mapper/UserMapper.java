package com.nero.mybatis.objectFactory.mapper;

import com.nero.mybatis.objectFactory.domain.User;

import java.util.List;

public interface UserMapper {

    User getUserById(Long id);

    List<User> getAllUser();

    int addUser(User user);

    int updateUser(User user);

    int deleteUser(Long id);
}
