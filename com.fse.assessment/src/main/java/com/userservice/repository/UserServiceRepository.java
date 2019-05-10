package com.userservice.repository;

import com.sun.corba.se.spi.ior.ObjectId;
import com.userservice.Model.UserServiceModel;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;

public interface UserServiceRepository extends MongoRepository<UserServiceModel, String> {
    UserServiceModel findBy_id(ObjectId _id);

    Optional<Object> findById(Integer id);
}




