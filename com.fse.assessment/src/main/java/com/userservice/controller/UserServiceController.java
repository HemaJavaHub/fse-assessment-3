package com.userservice.controller;

import com.userservice.Model.UserServiceModel;
import com.userservice.repository.UserServiceRepository;
import com.userservice.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

//As an end-user (i.e., using the web reservation app), my user actions are reported in the background.
//        As a reporting user, I can request a list of user events (for all users) that took place within a given timeframe.
//        As a reporting user, I can request a list of all user events for a single user, specified by their user id.

@RestController
public class UserServiceController {

    private UserServiceModel userServiceModel;


    private UserServiceRepository repository;
    private final UserService userService;


    @Autowired
    public UserServiceController(UserService userService) {
        this.userService = userService;
    }




    @PostMapping("/saveUserAction")
    private String saveUserAction(@RequestBody UserServiceModel userServiceModel){
        userService.saveUserAction(userServiceModel);
        return "saved";
    }


}
