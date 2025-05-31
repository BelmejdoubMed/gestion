package com.example.gestion.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.gestion.entity.UserEntity;

public interface UserRepository extends JpaRepository<UserEntity, String> { }
