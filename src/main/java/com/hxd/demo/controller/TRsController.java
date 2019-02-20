package com.hxd.demo.controller;

import com.hxd.demo.dao.UserDAO;
import com.hxd.demo.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/test")
public class TRsController {
    @Autowired
    private UserDAO userDAO;
    @RequestMapping("/1")
    public String s(){
       return "a";
    }

    @RequestMapping("/2")
    public String a(){
        List<User> users = userDAO.selectAll();
        for (User user:users) {
            System.out.println(user);

        }
        return "OK";
    }
}
