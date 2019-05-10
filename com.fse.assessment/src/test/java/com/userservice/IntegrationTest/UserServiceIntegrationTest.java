package com.userservice.IntegrationTest;

import com.userservice.Model.UserServiceModel;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;


import com.musicplayer.musicplayerrestapi.models.Playlist;

        import org.junit.Before;
        import org.junit.Test;
        import org.junit.runner.RunWith;
        import org.springframework.beans.factory.annotation.Autowired;
        import org.springframework.boot.test.context.SpringBootTest;
        import org.springframework.boot.test.web.client.TestRestTemplate;
        import org.springframework.http.HttpStatus;
        import org.springframework.http.ResponseEntity;
        import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.client.RestClientException;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.assertThat;
import static org.springframework.boot.test.context.SpringBootTest.WebEnvironment.RANDOM_PORT;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = RANDOM_PORT)
public class UserServiceIntegrationTest {

    @Autowired
    private TestRestTemplate restTemplate;


    private UserServiceModel userServiceModel;

    @Before
    public void testSetup() {


    }


    @Test
    public void postingAPlaylist_savesThePlaylist() throws RestClientException {

        //act
        ResponseEntity<String> response =  restTemplate.postForEntity("/saveUserAction",userServiceModel,String.class);

        //assert
        assertThat(response.getStatusCode()).isEqualTo(HttpStatus.OK);
        assertThat(response.getBody()).isEqualTo("saved");
    }
}