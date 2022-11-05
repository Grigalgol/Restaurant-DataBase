package com.example.database.controller;

import com.example.database.dto.UserRegistrationDTO;
import com.example.database.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/registration")
public class UserRegistrationController {

    private final UserService userService;

    @Autowired
    public UserRegistrationController(UserService userService) {
        this.userService = userService;
    }


    @GetMapping()
    public String getRegistrationPage(Model model){
        UserRegistrationDTO userRegistrationDTO = new UserRegistrationDTO();
        model.addAttribute("user", userRegistrationDTO);
        return "registration";
    }

    @PostMapping
    public String registerUserAccount(@ModelAttribute("user") UserRegistrationDTO userRegistrationDto) {
        userService.save(userRegistrationDto);
        return "redirect:/registration";
    }

}
