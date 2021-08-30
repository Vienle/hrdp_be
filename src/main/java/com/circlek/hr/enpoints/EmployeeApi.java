package com.circlek.hr.enpoints;

import com.circlek.hr.dtos.AuthDto;
import com.circlek.hr.dtos.LoginDto;
import com.circlek.hr.serivces.AuthService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RequestBody;

import javax.validation.Valid;


@RestController
@RequestMapping(value = "/api")
public class EmployeeApi {

    @Autowired
    private AuthService authService;

    @RequestMapping(value = "/login",method = RequestMethod.POST)
    public ResponseEntity<Object> login(@RequestBody String staffcode){
        return new ResponseEntity<>("dda", HttpStatus.OK);
        //return new ResponseEntity<>(authService.login(loginDto), HttpStatus.OK);
    }

    @GetMapping(value = "/test")
    public String test(){
        return "tesst";
    }

    @PostMapping("/2")
    public String testPost(@RequestBody AuthDto lo){
        return lo.getStaffCode();
    }
}
