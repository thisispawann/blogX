package com.thisispawann.blogx.controller;

import com.thisispawann.blogx.payload.UserDto;
import com.thisispawann.blogx.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/users")
public class UserController {

    @Autowired
    private UserService userService;

    // POST - create user
    @PostMapping("/")
    public ResponseEntity<UserDto> createUser(@RequestBody UserDto userDto) {
        UserDto createUserDto = this.userService.createUser(userDto);
        return new ResponseEntity<>(createUserDto, HttpStatus.CREATED);
    }
    // PUT - update user
@PutMapping("/{userId}")
    public ResponseEntity<UserDto> updateUser(@RequestBody UserDto userDto, @PathVariable("userId") Integer uid) {
        UserDto updatedUser =  this.userService.updateUser(userDto, uid);
        return ResponseEntity.ok(updatedUser);
}
    // DELETE - delete user

    // GET - user get
}
