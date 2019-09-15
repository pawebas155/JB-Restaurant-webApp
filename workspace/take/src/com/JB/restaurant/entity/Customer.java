package com.JB.restaurant.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity(name = "Customer")
@Table(name = "customer")
public class Customer {

	@Id
	@GeneratedValue
	private Long idCustomer;
	
	private String firstName;
	
	private String secondName;
//	//TODO delete
//	@OneToMany(mappedBy="customer")
//	private List<Choice> choices;
//	
//	public Customer(){
//		choices = new ArrayList<Choice>();
//	}
	
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
