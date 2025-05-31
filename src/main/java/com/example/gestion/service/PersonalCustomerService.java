package com.example.gestion.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.gestion.entity.PersonalCustomer;
import com.example.gestion.repository.PersonalCustomerRepository;

@Service
public class PersonalCustomerService {
    private final PersonalCustomerRepository repository;

    public PersonalCustomerService(PersonalCustomerRepository repository) {
        this.repository = repository;
    }

    public List<PersonalCustomer> findAll() { return repository.findAll(); }
    public Optional<PersonalCustomer> findById(Long id) { return repository.findById(id); }
    public PersonalCustomer save(PersonalCustomer entity) { return repository.save(entity); }
    public void deleteById(Long id) { repository.deleteById(id); }
}