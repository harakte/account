package com.template.account.service;

import com.template.account.dao.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class AuthService {

    private UserRepository userRepository;

    public String registerUser(){
        return null;
    }

}
