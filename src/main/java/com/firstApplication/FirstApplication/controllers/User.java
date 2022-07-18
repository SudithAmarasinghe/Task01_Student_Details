package com.firstApplication.FirstApplication.controllers;

import com.firstApplication.FirstApplication.domain.UserDTO;
import com.firstApplication.FirstApplication.services.UserServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/student")
public class User {

    @Autowired
    private UserServices userServices;

    @GetMapping("/see")
    public List<UserDTO> allUsers(){
        return userServices.findAllUsers();
    }

    @PostMapping("/add")
    public String addUser(@Valid @RequestBody UserDTO Userdata){
        return userServices.saveUser(Userdata);

    }


}
