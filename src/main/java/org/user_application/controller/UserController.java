package org.user_application.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.user_application.model.User;
import org.user_application.servise.UserService;

@RestController
@RequestMapping(
        value = "/users/1",
        produces = "application/json",
        method = RequestMethod.POST)
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping
    public User insertUser(@RequestBody User user) {
        return userService.save(user);
    }
}