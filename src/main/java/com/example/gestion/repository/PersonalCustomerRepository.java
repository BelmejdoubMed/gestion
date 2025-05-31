package com.example.gestion.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.gestion.entity.PersonalCustomer;

@Repository
public interface PersonalCustomerRepository extends JpaRepository<PersonalCustomer, Long> {}