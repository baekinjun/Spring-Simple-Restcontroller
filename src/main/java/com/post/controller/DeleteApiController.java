package com.post.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class DeleteApiController {

    //받는 리소스가 작기 떄문에 DTO보다는 패스 , 파람 받는것을 권장
    @DeleteMapping("/delete/{userId}")
    public void delete(@PathVariable(name = "userId") String id, @RequestParam String account) {
        System.out.println(id);
        System.out.println(account);

    }

}
