package com.thisispawann.blogx.controller;

import com.thisispawann.blogx.payload.ApiResponse;
import com.thisispawann.blogx.payload.UserDto;
import com.thisispawann.blogx.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

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

    @DeleteMapping("/{userId}")
    public ResponseEntity<ApiResponse> deleteUser(@PathVariable("userId") Integer uid) {
        this.deleteUser(uid); // Assuming this method performs the deletion logic
        return new ResponseEntity<>(new ApiResponse("User Deleted Successfully"), HttpStatus.OK);
    }


    // GET - user get
}
