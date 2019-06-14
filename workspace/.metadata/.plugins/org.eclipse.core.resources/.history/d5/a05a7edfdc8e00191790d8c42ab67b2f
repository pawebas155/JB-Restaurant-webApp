package com.JB.restaurant.ejb;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import com.JB.restaurant.entity.Order;

@Stateless
public class OrderEJB {

	@PersistenceContext(name="komis")
	EntityManager manager;
	
	public void create(Order order) {
		System.out.println("Creating order!");
		manager.persist(order);
	}
	
	public void delete(Long ido) {
		Order order = manager.find(Order.class, ido);
		manager.remove(order);
	}
	
	public Order find(Long ido){
		return manager.find(Order.class, ido);
	}
	
	public List<Order> get() {
		Query q = manager.createQuery("select o from Order o");
		@SuppressWarnings("unchecked")
		List<Order> list = q.getResultList();
		return list;
	}

	public void update(Order order) {
		order = manager.merge(order);
	}
}
