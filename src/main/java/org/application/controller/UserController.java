package org.application.controller;


import org.application.model.User;
import org.application.servise.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(
        value = "/users",
        produces = "application/json",
        method = RequestMethod.POST)
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping()
    public User insertUser(@RequestBody User user) {
        return userService.save(user);
    }
}