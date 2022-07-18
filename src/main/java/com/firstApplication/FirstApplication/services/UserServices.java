package com.firstApplication.FirstApplication.services;

import com.firstApplication.FirstApplication.domain.UserDTO;

import java.util.List;

public interface UserServices {

    List<UserDTO> findAllUsers();
    String saveUser(UserDTO userdata);
}
