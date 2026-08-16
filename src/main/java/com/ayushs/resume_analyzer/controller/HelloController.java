package com.ayushs.resume_analyzer.controller;
import com.ayushs.resume_analyzer.entity.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class HelloController {

    @GetMapping("/hello")
    public String hello(){
        return "AI Resume Analyzer Backend is Running!";
    }
}
