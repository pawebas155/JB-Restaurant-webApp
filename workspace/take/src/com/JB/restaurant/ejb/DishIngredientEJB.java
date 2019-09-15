package com.JB.restaurant.ejb;

import java.util.List;
import java.util.NoSuchElementException;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import com.JB.restaurant.entity.Dish;
import com.JB.restaurant.entity.DishIngredient;
import com.JB.restaurant.entity.Ingredient;

@Stateless
public class DishIngredientEJB {

	@PersistenceContext(name = "komis")
	EntityManager manager;

	public void create(DishIngredient dishIngredient) throws Exception {
		if (manager.find(Dish.class, dishIngredient.getIdDish()) == null
				|| manager.find(Ingredient.class, dishIngredient.getIdIngredient()) == null) {
			throw new Exception("Illegal idDish or idIngredient");
		}

		System.out.println("Creating dishIngredient!");
		manager.persist(dishIngredient);
	}

	public void delete(Long idc) {
		DishIngredient dishIngredient = manager.find(DishIngredient.class, idc);
		manager.remove(dishIngredient);
	}

	public DishIngredient find(Long idc) {
		return manager.find(DishIngredient.class, idc);
	}

	public List<DishIngredient> get() {
		Query q = manager.createQuery("select c from DishIngredient c");
		@SuppressWarnings("unchecked")
		List<DishIngredient> list = q.getResultList();
		return list;
	}

	public void update(DishIngredient dishIngredient) {
		dishIngredient = manager.merge(dishIngredient);
	}
}
