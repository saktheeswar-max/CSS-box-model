package com.edutrack.service;

import com.edutrack.entity.User;

import java.util.Optional;

public interface UserService {

    Optional<User> findByUsername(String username);
}
