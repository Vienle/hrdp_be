package com.circlek.hr.dtos;

import lombok.*;

@Getter
@Builder
public class AuthDto {
    private String staffCode;
    private String accessToken;
    private String role;
}
