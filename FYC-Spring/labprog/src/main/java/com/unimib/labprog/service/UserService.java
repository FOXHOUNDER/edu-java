package com.unimib.labprog.service;

import com.unimib.labprog.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    // public User findUserByEmail(String email);
    // public void saveUser(User user);
    @Autowired
    private UserRepository userRepository;

}
