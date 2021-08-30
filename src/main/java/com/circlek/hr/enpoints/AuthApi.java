package com.circlek.hr.enpoints;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/test")
public class AuthApi {

    @PostMapping(value = "/login")
    public String login(@RequestBody String username){
        return username;
    }
}
