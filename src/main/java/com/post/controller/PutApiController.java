package com.post.controller;

import com.post.dto.PutRequestDto;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class PutApiController {

    @PutMapping("/put/{userId}")
    public PutRequestDto put(@RequestBody PutRequestDto putRequestDto, @PathVariable(name = "userId") Long id) {
        System.out.println(id);
        return putRequestDto;

    }
}