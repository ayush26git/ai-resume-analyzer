package com.ayushs.resume_analyzer.controller;

import com.ayushs.resume_analyzer.dto.LoginRequest;
import com.ayushs.resume_analyzer.dto.LoginResponse;
import com.ayushs.resume_analyzer.dto.RegisterRequest;
import com.ayushs.resume_analyzer.dto.UserResponse;
import com.ayushs.resume_analyzer.entity.User;
import com.ayushs.resume_analyzer.service.UserService;
import org.springframework.web.bind.annotation.*;
import com.ayushs.resume_analyzer.service.JwtService;

@RestController
@RequestMapping("/api/auth")
public class UserController {

    private final UserService userService;
    private final JwtService jwtService;

    public UserController(UserService userService,
                          JwtService jwtService) {
        this.userService = userService;
        this.jwtService = jwtService;
    }

    @PostMapping("/register")
    public UserResponse register(@RequestBody RegisterRequest request) {

        User user = new User(
                request.getName(),
                request.getEmail(),
                request.getPassword()
        );

        User savedUser = userService.registerUser(user);

        return new UserResponse(
                savedUser.getId(),
                savedUser.getName(),
                savedUser.getEmail()
        );
    }

    @PostMapping("/login")
    public LoginResponse login(@RequestBody LoginRequest request) {

        User user = userService.loginUser(
                request.getEmail(),
                request.getPassword()
        );

        String token = jwtService.generateToken(user.getEmail());

        return new LoginResponse(
                user.getId(),
                user.getName(),
                user.getEmail(),
                token
        );
    }
}