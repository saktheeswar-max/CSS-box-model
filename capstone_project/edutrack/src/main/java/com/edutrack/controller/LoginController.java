package com.edutrack.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.edutrack.dto.LoginRequest;
import com.edutrack.dto.LoginResponse;
import com.edutrack.entity.User;
import com.edutrack.repository.UserRepository;

import java.util.Optional;

@RestController
@RequestMapping("/auth")
@CrossOrigin(origins = "*")
public class LoginController {

    @Autowired
    private UserRepository userRepository;

    @PostMapping("/login")
    public ResponseEntity<?> login(@RequestBody LoginRequest request) {

        System.out.println("=== LOGIN DEBUG ===");
        System.out.println("Username received: " + request.getUsername());
        System.out.println("Password received: " + request.getPassword());

        Optional<User> optionalUser = userRepository.findByUsername(request.getUsername());

        if (optionalUser.isEmpty()) {
            System.out.println("❌ USER NOT FOUND");
            return ResponseEntity.status(401).body("User not found");
        }

        User user = optionalUser.get();

        if (!user.getPassword().equals(request.getPassword())) {
            System.out.println("❌ INVALID PASSWORD");
            return ResponseEntity.status(401).body("Invalid password");
        }

        System.out.println("✅ USER FOUND IN DATABASE:");
        System.out.println("DB Username: " + user.getUsername());
        System.out.println("DB Password: " + user.getPassword());
        System.out.println("LOGIN SUCCESS ✅");

        LoginResponse response = new LoginResponse(
                user.getId(),
                user.getUsername(),
                user.getRole()
        );

        return ResponseEntity.ok(response);
    }
}
