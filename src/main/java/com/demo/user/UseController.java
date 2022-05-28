package com.demo.user;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/users")
public class UseController {
    private final UserService userService;

    @GetMapping
    public String index() {
        return "Hello world";
    }

    @GetMapping("/get")
    public String getUser() {
        return userService.getUser(1).toString();
    }
}
