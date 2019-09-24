package com.qfedu.controller;

import com.qfedu.entity.User;
import com.qfedu.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * @author 李冠凯.
 * @Description
 * @date 2019/9/9.
 * @time 17:16
 */
@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService service;

    @RequestMapping("/back")
    public String back() {

        return "forward:list";

    }

    @RequestMapping("/list")
    public ModelAndView list() {

        ModelAndView modelAndView = new ModelAndView();
        List<User> userList = service.list();
        modelAndView.addObject("userList", userList);
        modelAndView.setViewName("list");
        return modelAndView;
    }

    @RequestMapping("/findOne")
    public ModelAndView findOne(Integer id) {
        User user = service.findOne(id);
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("user", user);
        modelAndView.setViewName("detail");
        return modelAndView;
    }

    @RequestMapping("/find")
    public ModelAndView find(Integer id) {
        User user = service.findOne(id);
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("user", user);
        modelAndView.setViewName("update");
        return modelAndView;
    }

    @RequestMapping("/update")
    public String update(User user) {
        service.update(user);
        return "forward:list";
    }

    @RequestMapping("/delete")
    public String delete(Integer id) {
        service.delete(id);
        return "forward:list";
    }

    @RequestMapping("/add")
    public String add(User user) {

        service.add(user);
        return "forward:list";
    }
}
