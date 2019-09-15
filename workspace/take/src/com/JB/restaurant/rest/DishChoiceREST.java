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

import com.JB.restaurant.ejb.DishChoiceEJB;
import com.JB.restaurant.entity.Customer;
import com.JB.restaurant.entity.DishChoice;

@Path("/dish-choice")
@Consumes({ "application/json" })
@Produces({ "application/json" })
public class DishChoiceREST {

	@EJB
	DishChoiceEJB bean;

	@POST
	public String create(DishChoice dishChoice) {
		try {
			bean.create(dishChoice);
			return "DishChoice created!";
		} catch (Exception e) {
			return "DishChoice not created!";
		}
	}

	@GET
	public List<DishChoice> get() {
		List<DishChoice> list = bean.get();
		return list;
	}

	@DELETE
	@Path("/{id}")
	public void delete(@PathParam("id") Long id) {
		bean.delete(id);
	}
}
