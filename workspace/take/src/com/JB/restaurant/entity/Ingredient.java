package com.JB.restaurant.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity(name = "Ingredient")
@Table(name = "ingredient")
public class Ingredient {

	private String name;
	
	@Id
	@GeneratedValue
	private Long idIngredient;
	
	public void setName(String name){
		this.name = name;
	}
	
	public String getName(){
		return this.name;
	}
	
	public Long getId(){
		return this.idIngredient;
	}
	
	public void setId(Long id){
		this.idIngredient= id;
	}
}
