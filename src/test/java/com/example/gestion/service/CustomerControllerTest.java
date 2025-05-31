//package com.example.gestion.service;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
//import org.springframework.boot.test.mock.mockito.MockBean;
//import org.springframework.test.web.servlet.MockMvc;
//
//@WebMvcTest(CustomerControllerTest.class)
//class CustomerControllerTest {
////	@Autowired
//	//	private MockMvc mockMvc;
//	@Autowired
//
//	@MockBean
//	private CustomerService customerService;
//
//	//	@Test
//	//	void shouldReturnListOfCustomers() throws Exception {
//	//		Customer c1 = new PersonalCustomer("test1", "Sarwea", 1234567890123456L);
//	//		Customer c2 = new PersonalCustomer("Bob", "Bob", 9876543210987654L);
//	//		when(customerService.getAllCustomers()).thenReturn(List.of(c1,
//	//				c2));
//	//		mockMvc.perform(get("/customers"))
//	//		.andExpect(status().isOk())
//	//		.andExpect(jsonPath("$.length()").value(2))
//	//		.andExpect(jsonPath("$[0].nom").value("Ali"))
//	//		.andExpect(jsonPath("$[1].ville").value("Miami"));
//	//		
//	//	}
//}