package com.userservice.service;

import com.userservice.Model.UserServiceModel;
import com.userservice.repository.UserServiceRepository;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;

public class UserServiceTest {

    @Mock

    private UserServiceRepository userServiceRepository;
    private UserService userService;

    private UserServiceModel userServiceModel;


    @Before
    public void setUp() throws Exception {


    }


    @Test
    public void savePlaylist_savesThePlaylist() {
        userService.saveUserAction(userServiceModel);
        //verify(userServiceRepository, times(1)).save(userServiceModel);
    }

}