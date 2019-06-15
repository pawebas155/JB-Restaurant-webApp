package com.JB.restaurant.ejb;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;import com.JB.restaurant.entity.Choice;
import com.JB.restaurant.entity.Customer;

@Stateless
public class CustomerEJB {

	@PersistenceContext(name="komis")
	EntityManager manager;
	
	public void create(Customer customer) {
		System.out.println("Creating customer!");
		manager.persist(customer);
	}
	
	public void delete(Long idc) {
		Customer customer = manager.find(Customer.class, idc);
		manager.remove(customer);
	}
	
	public Customer find(Long idc){
		return manager.find(Customer.class, idc);
	}
	
	public List<Customer> get() {
		Query q = manager.createQuery("select c from Customer c");
		@SuppressWarnings("unchecked")
		List<Customer> list = q.getResultList();
		return list;
	}

	public void update(Customer customer) {
		customer = manager.merge(customer);
	}
}
