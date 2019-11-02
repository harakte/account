package com.template.account.controller;

import com.template.account.dto.SigninRequest;
import com.template.account.dto.Result;
import com.template.account.dto.SignupRequest;
import com.template.account.service.AuthService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import javax.validation.Valid;

@Controller
@AllArgsConstructor
public class AuthController {

    private AuthService authService;

    @PostMapping("/signup")
    public Result registerUser(@Valid @RequestBody SignupRequest request){
        return new Result();
    }

    @PostMapping("/signin")
    public Result authenticateUser(@Valid @RequestBody SigninRequest request){
        return new Result();
    }

}
