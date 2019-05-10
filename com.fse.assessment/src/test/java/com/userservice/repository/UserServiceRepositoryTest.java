package com.userservice.repository;

import com.userservice.Model.UserServiceModel;
import org.assertj.core.api.Assertions;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@DataJpaTest

public class UserServiceRepositoryTest {

    @Autowired
    private TestEntityManager testEntityManager;

    @Autowired
    private UserServiceRepository userServiceRepository;

    private UserServiceModel userServiceModel;


    @Test
    public void findById_findsInRepo()throws Exception{
        Integer id = testEntityManager.persistAndGetId(userServiceModel,Integer.class);
        userServiceModel = (UserServiceModel) userServiceRepository.findById(id).orElse(null);
        Assertions.assertThat(userServiceModel.getType()).isEqualTo("promotion-viewed");
    }

}