package com.userservice.controller;

import com.userservice.Model.UserServiceModel;
import com.userservice.service.UserService;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultActions;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import static org.hamcrest.collection.IsCollectionWithSize.hasSize;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.BDDMockito.given;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import com.fasterxml.jackson.databind.ObjectMapper;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@WebMvcTest(UserServiceController.class)

public class UserServiceControllerTest {



        @Autowired
        private MockMvc mockMvc;

        @Autowired
        ObjectMapper objectMapper;

        @MockBean
        private UserService userService;

        private UserServiceModel userServiceModel;


        @Before
        public void testSetup() {

        }


        @Test
        public void saveUserAction() throws Exception{

                mockMvc.perform(MockMvcRequestBuilders.post("/saveUserAction")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content(objectMapper.writeValueAsString("*.*");
//                verify("", times(1)).saveUserAction(any(UserServiceModel.class));
        }


}