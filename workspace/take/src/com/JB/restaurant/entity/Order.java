package com.JB.restaurant.entity;

import java.util.Date;

import javax.persistence.Embeddable;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Embeddable
@Table(name = "order")
public class Order {

	@ManyToOne
	Customer customer;
	
	@Id
	private Long idOrder;
	private Date date;
	private Integer tableNumber;
	
	public Long getIdOrder(){
		return idOrder;
	}
	public void setIdOrder(Long id){
		idOrder = id;
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
