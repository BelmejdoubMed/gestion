package com.example.gestion.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.gestion.entity.CorporateCustomer;
import com.example.gestion.repository.CorporateCustomerRepository;

@Service
public class CorporateCustomerService {
    private final CorporateCustomerRepository repository;

    public CorporateCustomerService(CorporateCustomerRepository repository) {
        this.repository = repository;
    }

    public List<CorporateCustomer> findAll() { return repository.findAll(); }
    public Optional<CorporateCustomer> findById(Long id) { return repository.findById(id); }
    public CorporateCustomer save(CorporateCustomer entity) { return repository.save(entity); }
    public void deleteById(Long id) { repository.deleteById(id); }
}