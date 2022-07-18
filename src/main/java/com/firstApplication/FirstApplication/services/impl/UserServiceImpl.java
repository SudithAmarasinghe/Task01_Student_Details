package com.firstApplication.FirstApplication.services.impl;

import com.firstApplication.FirstApplication.domain.UserDTO;
import com.firstApplication.FirstApplication.repositories.UserRepository;
import com.firstApplication.FirstApplication.services.UserServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserServices {

    @Autowired
    private UserRepository userRepository;

    @Override
    public List<UserDTO> findAllUsers() {
        List<UserDTO> allusers = userRepository.findAll();
        return allusers;
    }

    @Override
    public String saveUser(UserDTO userdata) {
        userRepository.save(userdata);
        return "Successfully added!";
    }
}