package com.JB.restaurant.rest;

import java.util.List;

import javax.ejb.EJB;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

import com.JB.restaurant.ejb.CustomerEJB;
import com.JB.restaurant.ejb.ChoiceEJB;
import com.JB.restaurant.entity.Customer;
import com.JB.restaurant.entity.Choice;


@Path("/choice")
@Consumes({ "application/json" })
@Produces({ "application/json" })

public class ChoiceREST {

	@EJB
	ChoiceEJB bean;
	
	@POST
	public String create(Choice choice) {
		bean.create(choice);
		return "choice created!";
	}
	
	@GET
	@Path("/{idc}")
	public Choice find(@PathParam("idc")Long ido){
		Choice choice = bean.find(ido);
		return choice;
	}
	
	@GET
	public List<Choice> get() {
		List<Choice> lOrders = bean.get();
		return lOrders;
	}
	
	@DELETE
	@Path("/{idc}")
	public void delete(@PathParam("idc") Long ido) {
		bean.delete(ido);
	}
}
