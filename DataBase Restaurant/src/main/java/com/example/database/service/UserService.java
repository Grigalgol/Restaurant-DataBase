package com.example.database.service;

import com.example.database.dto.UserRegistrationDTO;
import com.example.database.models.User;
import org.springframework.security.core.userdetails.UserDetailsService;

public interface UserService {
    User save(UserRegistrationDTO userRegistrationDTO);
}
