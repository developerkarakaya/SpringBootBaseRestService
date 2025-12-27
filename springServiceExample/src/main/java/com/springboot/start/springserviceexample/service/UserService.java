package com.springboot.start.springserviceexample.service;


import com.springboot.start.springserviceexample.SpringServiceExampleApplication;
import com.springboot.start.springserviceexample.model.User;
import com.springboot.start.springserviceexample.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class UserService {
    private  final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<User> getAllUsers(){
        List<User> all = userRepository.findAll();
        return all;
    }
}
