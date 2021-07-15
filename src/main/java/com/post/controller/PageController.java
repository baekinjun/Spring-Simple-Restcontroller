package com.post.controller;

import com.post.dto.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class PageController {

    @RequestMapping("/main")
    public String main() {
        return "main.html";
    }

    // Response Entity

    @ResponseBody
    @GetMapping("/user")
    public User user() {
        var user = new User();

        user.setName("steave");
        user.setAddress("패스트 캠퍼스");
        return user;
    }
}
