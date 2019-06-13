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
import com.JB.restaurant.ejb.OrderEJB;
import com.JB.restaurant.entity.Customer;
import com.JB.restaurant.entity.Order;


@Path("/order")
@Consumes({ "application/json" })
@Produces({ "application/json" })

public class OrderREST {

	@EJB
	OrderEJB bean;
	
	@POST
	public String create(Order order) {
		bean.create(order);
		return "order created!";
	}
	
	@GET
	@Path("/{idc}")
	public Order find(@PathParam("idc")Long ido){
		Order order = bean.find(ido);
		return order;
	}
	
	@GET
	public List<Order> get() {
		List<Order> lOrders = bean.get();
		return lOrders;
	}
	
	@DELETE
	@Path("/{idc}")
	public void delete(@PathParam("idc") Long ido) {
		bean.delete(ido);
	}
}
