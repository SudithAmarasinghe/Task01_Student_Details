package com.firstApplication.FirstApplication.repositories;

import com.firstApplication.FirstApplication.domain.UserDTO;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<UserDTO,Integer>{

}
