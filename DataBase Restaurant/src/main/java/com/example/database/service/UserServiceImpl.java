package com.example.database.service;

import com.example.database.dto.UserRegistrationDTO;
import com.example.database.models.Role;
import com.example.database.models.User;
import com.example.database.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;

//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.security.core.userdetails.UsernameNotFoundException;
//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
//import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    //@Autowired
    //private BCryptPasswordEncoder passwordEncoder;

    @Autowired
    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public User save(UserRegistrationDTO userRegistrationDTO) {
        User user = new User(userRegistrationDTO.getName(), userRegistrationDTO.getPhoneNumber(), userRegistrationDTO.getPassword(), Role.USER);
        return userRepository.save(user);
    }

//    @Override
//    public UserDetails loadUserByUsername(String phoneNumber) throws UsernameNotFoundException {
//        User user = userRepository.findByPhoneNumber(phoneNumber).orElseThrow(() ->
//                new UsernameNotFoundException("User doesn't exists"));
//        return new org.springframework.security.core.userdetails.User(
//                user.getPhoneNumber(), passwordEncoder.encode(user.getPassword()), user.getRole().getAuthorities());
//    }
}
