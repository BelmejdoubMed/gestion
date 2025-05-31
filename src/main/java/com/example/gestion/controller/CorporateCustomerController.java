package com.example.gestion.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.gestion.entity.CorporateCustomer;
import com.example.gestion.service.CorporateCustomerService;

@RestController
@RequestMapping("/corporate-customers")
public class CorporateCustomerController {
    private final CorporateCustomerService service;

    public CorporateCustomerController(CorporateCustomerService service) {
        this.service = service;
    }

    @GetMapping
    public List<CorporateCustomer> getAll() {
        return service.findAll();
    }

    @GetMapping("/{id}")
    public CorporateCustomer getById(@PathVariable Long id) {
        return service.findById(id).orElseThrow();
    }

    @PostMapping
    public CorporateCustomer create(@RequestBody CorporateCustomer entity) {
        return service.save(entity);
    }

    @PutMapping("/{id}")
    public CorporateCustomer update(@PathVariable Long id, @RequestBody CorporateCustomer entity) {
        entity.setId(id);
        return service.save(entity);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        service.deleteById(id);
    }
}
