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

import com.JB.restaurant.ejb.IngredientEJB;
import com.JB.restaurant.entity.Customer;
import com.JB.restaurant.entity.Ingredient;

@Path("/ingredient")
@Consumes({ "application/json" })
@Produces({ "application/json" })
public class IngredientREST {
	
	@EJB
	IngredientEJB bean;
	
	@POST
	public String create(Ingredient ingredient) {
		bean.create(ingredient);
		return "ingredient created!";
	}
	
	@GET
	@Path("/{idd}")
	public Ingredient find(@PathParam("idd")Long idi){
		Ingredient ingredient = bean.find(idi);
		return ingredient;
	}
	
	@GET
	public List<Ingredient> get() {
		List<Ingredient> list = bean.get();
		return list;
	}
	
	@DELETE
	@Path("/{idi}")
	public void delete(@PathParam("idi") Long idi) {
		bean.delete(idi);
	}
	
	@PUT
	public String update(Ingredient ingredient) {
		try {
			bean.update(ingredient);
			return "ingredient updated!";
		} catch (Exception e) {
			e.printStackTrace();
			return "ingredient not updated";
		}
	}
}
