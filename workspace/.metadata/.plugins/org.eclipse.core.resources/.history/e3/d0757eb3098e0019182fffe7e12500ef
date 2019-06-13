package com.JB.restaurant.entity;

import java.util.List;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity(name = "Customer")
@Table(name = "customer")
public class Customer {

	@Id
	@GeneratedValue
	private Long idCustomer;
	private String firstName;
	private String secondName;
	
	@OneToMany(mappedBy="order.customer")
	@Embedded
	private List<Order> orders;
	
	public Long getIdCustomer(){
		return idCustomer;
	}
	public void setIdCustomer(Long id){
		idCustomer = id;
	}
	
	public String getFirstName(){
		return firstName;
	}
	public void setFirstName(String firstName){
		this.firstName = firstName;
	}
	
	public String getSecondName(){
		return secondName;
	}
	public void setSecondName(String secondName){
		this.secondName = secondName;
	}
}
