package com.siva.Examples;

import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class UserService {

    @Autowired
    private UserRepository userRepository;


    public List<User> getAllUser(){

        return userRepository.findAll();

    }

    public Optional<User> getUserById(String id){

        return userRepository.findById(Integer.parseInt(id));

    }

    public User saveUser(User user){

        return userRepository.save(user);
    }

    public void deleteUser(User user){

        userRepository.delete(user);
    }
}
