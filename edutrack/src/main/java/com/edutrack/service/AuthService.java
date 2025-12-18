package com.edutrack.service;

import com.edutrack.entity.User;

public interface AuthService {
    User login(String username, String password);
}
