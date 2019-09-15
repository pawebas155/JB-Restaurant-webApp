package com.JB.restaurant.dto;


public class ChoiceDTO {
	
	private Integer tableNumber;
	
	private Long idCustomer;
	
	public void setCustomerId(Long id){
		this.idCustomer = id;
	}
	
	public Long getIdCustomer(){
		return this.idCustomer;
	}
	
	
	public void setTableNumber(Integer tableNumber){
		this.tableNumber = tableNumber;
	}
	
	public Integer getTableNumber(){
		return this.tableNumber;
	}

	
}
