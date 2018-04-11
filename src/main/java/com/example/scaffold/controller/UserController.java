package com.example.scaffold.controller;

import com.example.scaffold.domain.User;
import com.example.scaffold.domain.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

@Controller
@RequestMapping("/users")
public class UserController {

    @Autowired
    UserRepository userRepository;

    @ResponseBody
    @RequestMapping(method = GET, produces = "application/json")
    public List<User> readAllUsers() {
        return userRepository.findAll();
    }
}
