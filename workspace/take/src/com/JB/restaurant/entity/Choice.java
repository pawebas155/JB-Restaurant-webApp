package com.JB.restaurant.entity;

import com.JB.restaurant.entity.Customer;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity(name = "Choice")
@Table(name = "choice")
public class Choice {

	@ManyToOne
	@JoinColumn(name = "idCustomer")
	Customer customer;
	
	@Id
	@GeneratedValue
	private Long idChoice;
	private Date date;
	private Integer tableNumber;
	
	public Choice(){
		date = new Date();
	}
	
	public Long getIdChoice(){
		return idChoice;
	}
	public void setIdChoice(Long id){
		idChoice = id;
	}
	
	public Date getDate(){
		return date;
	}
	public void setDate(Date date){
		this.date = date;
	}
	
	public Integer getTableNumber(){
		return tableNumber;
	}
	public void setTableNumber(Integer tableNumber){
		this.tableNumber = tableNumber;
	}
	
	public void setCustomer(Customer customer){
		this.customer = customer;
	}
	
	public Long getCustomerId(){
		return this.customer.getIdCustomer();
	}
}
