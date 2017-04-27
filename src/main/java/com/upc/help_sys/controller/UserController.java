package com.upc.help_sys.controller;

import com.upc.help_sys.dao.UserRepository;
import com.upc.help_sys.dao.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Liuyibo on 2017/4/27.
 */
@RestController
public class UserController {
    @Autowired
    User user;
    @Autowired
    UserRepository repository;

    @RequestMapping("/add_user")
    public void add(User user) {
        repository.save(user);
    }

    @RequestMapping("/get_user_id")
    public User get(int id) {
        return repository.findOne(id);
    }
}
