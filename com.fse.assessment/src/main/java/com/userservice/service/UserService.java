package com.userservice.service;

import com.userservice.Model.UserServiceModel;
import com.userservice.repository.UserServiceRepository;

public class UserService {

    private UserServiceRepository userServiceRepository;


    public void saveUserAction(UserServiceModel userServiceModel) {

        userServiceRepository.save(userServiceModel);

    }


}
