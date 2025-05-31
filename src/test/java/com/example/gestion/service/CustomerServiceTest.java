package com.example.gestion.service;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.when;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.gestion.entity.Customer;
import com.example.gestion.entity.PersonalCustomer;
import com.example.gestion.repository.CustomerRepository;

@SpringBootTest 
public class CustomerServiceTest {
	@Mock
	private CustomerRepository customerRepository;
	@InjectMocks
	private CustomerService customerService;
	@Test
	void shouldReturnAllPersons() {
		Customer c1 = new PersonalCustomer("test1", "John Doe", 1234567890123456L);
		Customer c2 = new PersonalCustomer("test2", "Jane Doe", 9876543210987654L);
		when(customerRepository.findAll()).thenReturn(List.of(c1, c2));
		List<Customer> customers = customerService.getAllCustomers();
		assertThat(customers).hasSize(2);
	}
	@Test
	void firstCustomerShouldHaveExpectedName() {
		Customer c1 = new PersonalCustomer("test1", "Sarwea", 1234567890123456L);
		Customer c2 = new PersonalCustomer("test2", "Smith", 9876543210987654L);
		//Customer c1 = new CorporateCustomer("test1", "Sara", "contact1", 1000.0, "A");
		//Customer c2 = new CorporateCustomer("test2", "Smith", "contact2", 2000.0, "B");
		//when(customerRepository.findAll()).thenReturn(List.of(c1, c2));
		//List<Customer> customers = customerService.getAllCustomers();
		//assertThat(customers.get(0).getName()).isEqualTo("Sara");

		when(customerRepository.findAll()).thenReturn(List.of(c1, c2));
		List<Customer> customers = customerService.getAllCustomers();
		assertThat(customers.get(0).getName()).isEqualTo("Sara"); }


	@Test
	void shouldContainCustomerWithNameBob() {
		Customer c1 = new PersonalCustomer("test1", "Sarwea", 1234567890123456L);
		Customer c2 = new PersonalCustomer("Bob", "Bob", 9876543210987654L);
		when(customerRepository.findAll()).thenReturn(List.of(c1, c2));
		List<Customer> customers = customerService.getAllCustomers();
		boolean containsBob = customers.stream()
				.anyMatch(c -> c.getName().equals("Bob"));
		assertThat(containsBob).isTrue(); }

}
