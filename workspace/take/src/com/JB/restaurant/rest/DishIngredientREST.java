package com.JB.restaurant.rest;

import java.util.List;
import java.util.NoSuchElementException;

import javax.ejb.EJB;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

import com.JB.restaurant.ejb.DishIngredientEJB;
import com.JB.restaurant.ejb.DishIngredientEJB;
import com.JB.restaurant.entity.DishIngredient;

@Path("/dish-ingredient")
@Consumes({ "application/json" })
@Produces({ "application/json" })
public class DishIngredientREST {

	@EJB
	DishIngredientEJB bean;

	@POST
	public String create(DishIngredient dishIngredient) {
		try {
			bean.create(dishIngredient);
			return "DishIngredient created!";
		} catch (Exception e) {
			return "DishIngredient not created!";
		}
	}

	@GET
	public List<DishIngredient> get() {
		List<DishIngredient> list = bean.get();
		return list;
	}

	@DELETE
	@Path("/{id}")
	public void delete(@PathParam("id") Long id) {
		bean.delete(id);
	}
}
