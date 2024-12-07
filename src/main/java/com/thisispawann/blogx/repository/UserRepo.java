package com.thisispawann.blogx.repository;

import com.thisispawann.blogx.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface UserRepo extends JpaRepository<User, Integer> {
}
