package com.JB.restaurant.ejb;

import java.util.List;
import java.util.NoSuchElementException;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import com.JB.restaurant.entity.Dish;
import com.JB.restaurant.entity.DishChoice;
import com.JB.restaurant.entity.Choice;

@Stateless
public class DishChoiceEJB {

	@PersistenceContext(name="komis")
	EntityManager manager;
	
	public void create(DishChoice dishChoice) throws Exception {
		if (manager.find(Dish.class, dishChoice.getIdDish()) == null
				|| manager.find(Choice.class, dishChoice.getIdChoice()) == null){
			throw new Exception("Illegal idDish or idChoice");
		}
		System.out.println("Creating dishChoice!");
		manager.persist(dishChoice);
	}
	
	public void delete(Long idc) {
		DishChoice dishChoice = manager.find(DishChoice.class, idc);
		manager.remove(dishChoice);
	}
	
	public DishChoice find(Long idc){
		return manager.find(DishChoice.class, idc);
	}
	
	public List<DishChoice> get() {
		Query q = manager.createQuery("select c from DishChoice c");
		@SuppressWarnings("unchecked")
		List<DishChoice> list = q.getResultList();
		return list;
	}

	public void update(DishChoice dishChoice) {
		dishChoice = manager.merge(dishChoice);
	}
}
