package com.circlek.hr.serivces.impl;

import com.circlek.hr.dtos.LoginDto;
import com.circlek.hr.dtos.AuthDto;
import com.circlek.hr.repository.CredentialRepo;
import com.circlek.hr.repository.EmployeeRepo;
import com.circlek.hr.serivces.AuthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class AuthServiceImp implements AuthService {

    @Autowired
    private EmployeeRepo employeeRepo;
    @Autowired
    private CredentialRepo credentialRepo;

    @Override
    public AuthDto login(LoginDto loginDto)  {
        try {
//            Optional<Employee> employeeRaw = employeeRepo.findByStaffCodeAndStatus(loginDto.getStaffCode(), 1);
//
//            Employee employee = employeeRaw.get();
//
//            Credential credential = new Credential();
//            credential.setAccessToken(UUID.randomUUID().toString());
//            credential.setEmployee(employee);
//            return AuthDto.builder()
//                    .staffCode(employee.getStaffCode())
//                    .role("admin")
//                    .accessToken(credential.getAccessToken())
//                    .build();

            return AuthDto.builder()
                    .staffCode("daddada")
                    .role("admin")
                    .accessToken("aadad")
                    .build();
        } catch (Exception ex){
          throw (ex);
        }
    }

    @Override
    public boolean forgotPassword() {
        return false;
    }
}
