package com.momentslee.springboot.learnspringsecurity;

import com.momentslee.springboot.learnspringsecurity.common.JwtTokenProvider;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppController {

    private final JwtTokenProvider jwtTokenProvider;

    public AppController(JwtTokenProvider jwtTokenProvider) {
        this.jwtTokenProvider = jwtTokenProvider;
    }

    @GetMapping("/")
    public String health() {
        return this.jwtTokenProvider.createToken("test");
    }
}
