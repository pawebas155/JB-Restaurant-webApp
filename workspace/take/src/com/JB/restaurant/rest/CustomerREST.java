package com.JB.restaurant.rest;

import java.util.List;

import javax.ejb.EJB;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

import com.JB.restaurant.ejb.CustomerEJB;
import com.JB.restaurant.entity.Customer;

import pl.kurs.komis.Car;

@Path("/customer")
@Consumes({ "application/json" })
@Produces({ "application/json" })

public class CustomerREST {

	@EJB
	CustomerEJB bean;
	
	@POST
	public String create(Customer customer) {
		bean.create(customer);
		return "customer created!";
	}
	
	@GET
	@Path("/{idc}")
	public Customer find(@PathParam("idc")Long idc){
		Customer customer = bean.find(idc);
		return customer;
	}
	
	@GET
	public List<Customer> get() {
		List<Customer> lCustomers = bean.get();
		return lCustomers;
	}
	
	@DELETE
	@Path("/{idc}")
	public void delete(@PathParam("idc") Long idc) {
		bean.delete(idc);
	}
	
	@PUT
	public String update(Customer customer) {
		try {
			bean.update(customer);
			return "car updated!";
		} catch (Exception e) {
			e.printStackTrace();
			return "car not updated :(";
		}
	}
	
	
}
