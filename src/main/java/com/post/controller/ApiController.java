package com.post.controller;

import com.post.dto.User;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class ApiController {

    //TEXT
    @GetMapping("/text")
    public String text(@RequestParam String account) {
        return account;
    }

    //Json
    @PostMapping("/json")
    public User json(@RequestBody User user) {
        return user;

    }

    //response entity
    @PutMapping("/pjson")
    public ResponseEntity<User> put(@RequestBody User user) {
        return ResponseEntity.status(HttpStatus.CREATED).body(user);

    }

}
