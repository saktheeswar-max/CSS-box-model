package com.edutrack.service.impl;

import com.edutrack.entity.User;
import com.edutrack.repository.UserRepository;
import com.edutrack.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository repo;

    @Override
    public Optional<User> findByUsername(String username) {
        return repo.findByUsername(username);
    }
}
