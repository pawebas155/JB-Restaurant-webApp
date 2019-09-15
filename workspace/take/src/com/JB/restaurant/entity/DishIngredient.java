package com.JB.restaurant.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity(name = "DishIngredient")
@Table(name = "dish_ingredient")
public class DishIngredient implements Serializable {

	@Id
	private Long idDish;
	
	@Id
	private Long idIngredient;

	public Long getIdDish() {
		return idDish;
	}

	public void setIdDish(Long idDish) {
		this.idDish = idDish;
	}

	public Long getIdIngredient() {
		return idIngredient;
	}

	public void setIdIngredient(Long idIngredient) {
		this.idIngredient = idIngredient;
	}
	
	
}
