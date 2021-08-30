package com.circlek.hr.serivces;

import com.circlek.hr.dtos.LoginDto;
import com.circlek.hr.dtos.AuthDto;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import javax.persistence.Column;

public interface AuthService {
    AuthDto login(LoginDto loginDto);

    boolean forgotPassword();
}
