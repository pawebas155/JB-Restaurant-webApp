package com.JB.restaurant.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity(name = "Dish")
@Table(name = "dish")
public class Dish {

	private String name;
	
	private Double price;
	
	@Id
	@GeneratedValue
	private Long idDish;
	
	public String getName(){
		return this.name;
	}
	
	public void setName(String name){
		this.name = name;
	}
	
	public Double getPrice(){
		return this.price;
	}
	
	public void setPrice(Double price){
		this.price = price;
	}
	
	public Long getId(){
		return this.idDish;
	}
	
	public void setId(Long id){
		this.idDish = id;
	}
}
