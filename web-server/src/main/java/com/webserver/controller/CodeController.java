package com.webserver.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping
public class CodeController {
    @PostMapping("code")
    public String submitCode(@RequestParam String sourceCode) {
        return "";
    }

    @GetMapping("code")
    public String getResult() {
        return "";
    }
}
