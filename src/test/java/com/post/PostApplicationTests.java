package com.post;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.post.dto.Users;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class PostApplicationTests {

    @Test
    void contextLoads() throws JsonProcessingException {

        var objectMapper = new ObjectMapper();

        var user = new Users("steave", 10,"01029411801");

        //object -> text
        // object mapper get method 활용한다.
        var text = objectMapper.writeValueAsString(user);
        System.out.println(text);

        //text -> object
        // object mapper 는 default 생성자가 필요하다.
        var objectUser = objectMapper.readValue(text, Users.class);
        System.out.println(objectUser);

    }

}
