package com.JB.restaurant.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity(name = "DishChoice")
@Table(name = "dish_choice")
public class DishChoice implements Serializable {
	
	@Id
	private Long idDish;

	@Id
	private Long idChoice;

	public Long getIdDish() {
		return idDish;
	}

	public void setIdDish(Long idDish) {
		this.idDish = idDish;
	}

	public Long getIdChoice() {
		return idChoice;
	}

	public void setIdChoice(Long idChoice) {
		this.idChoice = idChoice;
	}
	
	
}
