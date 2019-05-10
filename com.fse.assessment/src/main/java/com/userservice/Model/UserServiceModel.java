package com.userservice.Model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Document(collection = "UserService")

public class UserServiceModel {


    @Id
    public long userId;

    public String type;

    public String context;
    Date  timestamp;


    public UserServiceModel(long userId, String type, String context, Date timestamp) {
        this.userId = userId;
        this.type = type;
        this.context = context;
        this.timestamp = timestamp;
    }

    public UserServiceModel(){



    }


    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getContext() {
        return context;
    }

    public void setContext(String context) {
        this.context = context;
    }

    public Date getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Date timestamp) {
        this.timestamp = timestamp;
    }
}
