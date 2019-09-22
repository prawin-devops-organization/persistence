package com.praveen;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
	@Autowired 
	private EntityManager em;
	
	/*
	 * @Autowired private EntityManager em;
	 * 
	 * @GetMapping("/id/{id}") public Customer getCustomer(@PathVariable Integer id)
	 * { return em.find(Customer.class,id); }
	 */
	
	@GetMapping("/hello/{id}")
	public Customer hi(@PathVariable Integer id) {
		return em.find(Customer.class,id);
	}

}
