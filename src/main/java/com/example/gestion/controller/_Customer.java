package com.example.gestion.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.gestion.service.CustomerService;

@RestController
@RequestMapping("/customers")
public class _Customer {
	
	@Autowired CustomerService customerService;
	
}
