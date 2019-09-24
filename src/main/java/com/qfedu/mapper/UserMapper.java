package com.qfedu.mapper;

import com.qfedu.entity.User;

import java.util.List;

/**
 * @author 李冠凯.
 * @Description
 * @date 2019/9/9.
 * @time 16:47
 */
public interface UserMapper {

    List<User> findAll();

    User findOne(Integer id);

    void add(User user);

    void delete(Integer id);

    void update(User user);
}
