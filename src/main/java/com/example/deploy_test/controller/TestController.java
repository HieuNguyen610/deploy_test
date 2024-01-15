package com.example.deploy_test.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @GetMapping("/health")
    public String health() {
        return "Hello & Welcome to CloudKatha !!!";
    }

    @GetMapping("/check")
    public String check() {
        return "check api";
    }

    @GetMapping("/checkB2")
    public String checkBranch2() {
        return "check api B2";
    }
}
