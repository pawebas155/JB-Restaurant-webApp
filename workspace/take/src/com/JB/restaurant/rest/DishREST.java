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

import com.JB.restaurant.ejb.DishEJB;
import com.JB.restaurant.entity.Customer;
import com.JB.restaurant.entity.Dish;

@Path("/dish")
@Consumes({ "application/json" })
@Produces({ "application/json" })
public class DishREST {

	@EJB
	DishEJB bean;
	
	@POST
	public String create(Dish dish) {
		bean.create(dish);
		return "dish created!";
	}
	
	@GET
	@Path("/{idd}")
	public Dish find(@PathParam("idd")Long idd){
		Dish dish = bean.find(idd);
		return dish;
	}
	
	@GET
	public List<Dish> get() {
		List<Dish> lDishes = bean.get();
		return lDishes;
	}
	
	@DELETE
	@Path("/{idd}")
	public void delete(@PathParam("idd") Long idd) {
		bean.delete(idd);
	}
	
	@PUT
	public String update(Dish dish) {
		try {
			bean.update(dish);
			return "dish updated!";
		} catch (Exception e) {
			e.printStackTrace();
			return "dish not updated";
		}
	}
}
