package org.user_application.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.user_application.model.User;
import org.user_application.servise.UserMongoService;

@RestController
@RequestMapping(
        value = "/users/2",
        produces = "application/json",
        method = RequestMethod.POST)
public class UserMongoController {
    @Autowired
    private UserMongoService userMongoService;

    @GetMapping
    public User insertUser(@RequestBody User user) {
        return userMongoService.save(user);
    }
}
