package com.example.demo.security;

import com.example.demo.entities.User;
import org.springframework.security.core.userdetails.UserDetailsService;


public interface UserService extends UserDetailsService{
    User save(UserRegistrationDto registrationDto);
}
