package com.example.flywaydemo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.flywaydemo.user.User;

public interface UserDao extends JpaRepository<User, Integer>{
 
    
}
    
    