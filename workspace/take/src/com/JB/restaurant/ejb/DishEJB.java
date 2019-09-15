package com.JB.restaurant.ejb;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import com.JB.restaurant.entity.Dish;

@Stateless
public class DishEJB {

	@PersistenceContext(name="komis")
	EntityManager manager;
	
	public void create(Dish dish) {
		System.out.println("Creating dish!");
		manager.persist(dish);
	}
	
	public void delete(Long idd) {
		Dish dish = manager.find(Dish.class, idd);
		manager.remove(dish);
	}
	
	public Dish find(Long idd){
		return manager.find(Dish.class, idd);
	}
	
	public List<Dish> get() {
		Query q = manager.createQuery("select d from Dish d");
		@SuppressWarnings("unchecked")
		List<Dish> list = q.getResultList();
		return list;
	}

	public void update(Dish dish) {
		dish = manager.merge(dish);
	}
}
