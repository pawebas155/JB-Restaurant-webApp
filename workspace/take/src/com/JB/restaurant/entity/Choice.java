package com.JB.restaurant.entity;

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
}