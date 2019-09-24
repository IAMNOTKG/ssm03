package com.qfedu.service.impl;

import com.qfedu.entity.User;
import com.qfedu.mapper.UserMapper;
import com.qfedu.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author 李冠凯.
 * @Description
 * @date 2019/9/9.
 * @time 17:14
 */
@Service
public class UserServiceimpl implements UserService {

    @Autowired
    private UserMapper mapper;

    @Override
    public List<User> list() {
        return mapper.findAll();
    }

    @Override
    public User findOne(Integer id) {
        return mapper.findOne(id);
    }

    @Override
    public void add(User user) {
        mapper.add(user);
    }

    @Override
    public void delete(Integer id) {
        mapper.delete(id);
    }

    @Override
    public void update(User user) {
        mapper.update(user);
    }
}
