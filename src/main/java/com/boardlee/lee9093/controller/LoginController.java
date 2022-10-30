package com.boardlee.lee9093.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class LoginController {
    // TODO 오늘은 여기까지
    @GetMapping("/hello")
    public ResponseEntity<String> test() {
        return ResponseEntity.ok("test");
    }
}
