package com.JB.restaurant.ejb;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import com.JB.restaurant.entity.Ingredient;

@Stateless
public class IngredientEJB {


	@PersistenceContext(name="komis")
	EntityManager manager;
	
	public void create(Ingredient ingredient) {
		System.out.println("Creating ingredient!");
		manager.persist(ingredient);
	}
	
	public void delete(Long idi) {
		Ingredient ingredient = manager.find(Ingredient.class, idi);
		manager.remove(ingredient);
	}
	
	public Ingredient find(Long idi){
		return manager.find(Ingredient.class, idi);
	}
	
	public List<Ingredient> get() {
		Query q = manager.createQuery("select i from Ingredient i");
		@SuppressWarnings("unchecked")
		List<Ingredient> list = q.getResultList();
		return list;
	}

	public void update(Ingredient ingredient) {
		ingredient = manager.merge(ingredient);
	}
}
