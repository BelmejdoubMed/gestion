package com.example.gestion.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.gestion.entity.CorporateCustomer;

@Repository

public interface CorporateCustomerRepository extends JpaRepository<CorporateCustomer, Long> {}