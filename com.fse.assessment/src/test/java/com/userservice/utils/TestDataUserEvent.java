package com.userservice.utils;

import com.userservice.Model.UserServiceModel;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TestDataUserEvent {




        public static List<UserServiceModel> getUserEvents(){
            List<UserServiceModel> userServiceModels = new ArrayList<UserServiceModel>();
            Date date1=new SimpleDateFormat("dd/MM/yyyy").parse(1544401072);

            userServiceModels.add(new UserServiceModel(Long.parseLong("1b468f7d-79e8-40c1-80a2-0dd7226e7771"),"promotion-viewed","homepage.topnav",date1));


            return userServiceModels;
        }
    }

}
