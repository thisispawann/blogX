package com.thisispawann.blogx.services;

import com.thisispawann.blogx.payload.UserDto;

import java.util.List;

public interface UserService {

    UserDto  createUser(UserDto user);
    UserDto updateUser(UserDto user, Integer userId);
    UserDto getUserById(Integer userId);
    List<UserDto> getAllUsers();
    void deleteUser(Integer userId);
}
