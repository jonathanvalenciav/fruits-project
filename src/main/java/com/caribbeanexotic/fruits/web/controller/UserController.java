package com.caribbeanexotic.fruits.web.controller;

import com.caribbeanexotic.fruits.domain.dto.auth.UserApp;
import com.caribbeanexotic.fruits.domain.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping("/save")
    public ResponseEntity<UserApp> save(@RequestBody UserApp user) {
        return new ResponseEntity<>(userService.saveUser(user), HttpStatus.OK);
    }

    @GetMapping("/saveAdmin")
    public ResponseEntity<UserApp> saveAdmin() {
        UserApp userApp = new UserApp();
        userApp.setUsername("admin");
        userApp.setPassword("admin");
        userApp.setEnabled(true);
        return new ResponseEntity<>(userService.saveUser(userApp), HttpStatus.OK);
    }
}
