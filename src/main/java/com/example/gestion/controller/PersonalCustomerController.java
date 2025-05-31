package com.example.gestion.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.gestion.entity.PersonalCustomer;
import com.example.gestion.service.PersonalCustomerService;

import io.swagger.v3.oas.annotations.parameters.RequestBody;

@RestController
@RequestMapping("/personal-customers")
public class PersonalCustomerController {
    private final PersonalCustomerService service;

    public PersonalCustomerController(PersonalCustomerService service) {
        this.service = service;
    }

    @GetMapping
    public List<PersonalCustomer> getAll() {
        return service.findAll();
    }

    @GetMapping("/{id}")
    public PersonalCustomer getById(@PathVariable Long id) {
        return service.findById(id).orElseThrow();
    }

    @PostMapping
    public PersonalCustomer create(@RequestBody PersonalCustomer entity) {
        return service.save(entity);
    }

    @PutMapping("/{id}")
    public PersonalCustomer update(@PathVariable Long id, @RequestBody PersonalCustomer entity) {
        entity.setId(id);
        return service.save(entity);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        service.deleteById(id);
    }
}
