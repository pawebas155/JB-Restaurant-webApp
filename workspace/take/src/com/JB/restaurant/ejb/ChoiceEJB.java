package com.JB.restaurant.ejb;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import com.JB.restaurant.entity.Choice;
import com.JB.restaurant.entity.Customer;

@Stateless
public class ChoiceEJB {

	@PersistenceContext(name="komis")
	EntityManager manager;
	
	public void create(Choice choice, Long idCustomer) {
		System.out.println("Creating order!");
		choice.setCustomer(manager.find(Customer.class, idCustomer));
		manager.persist(choice);
	}
	
	public void create(Choice choice) {
		System.out.println("Creating order!");
		manager.persist(choice);
	}
	
	public void delete(Long ido) {
		Choice choice = manager.find(Choice.class, ido);
		manager.remove(choice);
	}
	
	public Choice find(Long ido){
		return manager.find(Choice.class, ido);
	}
	
	public List<Choice> get() {
		Query q = manager.createQuery("select c from Choice c");
		@SuppressWarnings("unchecked")
		List<Choice> list = q.getResultList();
		return list;
	}

	public void update(Choice choice) {
		choice = manager.merge(choice);
	}
}
