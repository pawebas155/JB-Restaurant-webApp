package com.JB.restaurant.entity;

import java.util.Date;

import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity(name = "Order")
@Table(name = "order")
public class Order {

	@ManyToOne
	@JoinColumn(name = "idCustomer")
	Customer customer;
	
	@Id
	@GeneratedValue
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
