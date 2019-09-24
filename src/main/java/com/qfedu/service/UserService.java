package com.qfedu.service;

import com.qfedu.entity.User;

import java.util.List;

/**
 * @author 李冠凯.
 * @Description
 * @date 2019/9/9.
 * @time 17:00
 */
public interface UserService {

    List<User> list();

    User findOne(Integer id);

    void add(User user);

    void delete(Integer id);

    void update(User user);

}
