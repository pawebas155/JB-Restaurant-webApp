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
import com.JB.restaurant.dto.ChoiceDTO;
import com.JB.restaurant.ejb.ChoiceEJB;
import com.JB.restaurant.entity.Customer;
import com.JB.restaurant.entity.Choice;

@Path("/choice")
@Consumes({ "application/json" })
@Produces({ "application/json" })

public class ChoiceREST {

	@EJB
	ChoiceEJB choiceBean;

	@EJB
	CustomerEJB customerBean;

	@POST
	public String create(ChoiceDTO choiceDTO) {
		if (customerBean.find(choiceDTO.getIdCustomer()) != null) {
			choiceBean.create(choiceDTO);
			return "choice created!";
		} else {
			return "Customer of id " + choiceDTO.getIdCustomer() + " not found";
		}
	}

	@GET
	@Path("/{idc}")
	public Choice find(@PathParam("idc") Long ido) {
		Choice choice = choiceBean.find(ido);
		return choice;
	}

	@GET
	public List<Choice> get() {
		List<Choice> lOrders = choiceBean.get();
		return lOrders;
	}

	@DELETE
	@Path("/{idc}")
	public void delete(@PathParam("idc") Long ido) {
		choiceBean.delete(ido);
	}

	@PUT
	public String update(Choice choice) {
		try {
			choiceBean.update(choice);
			return "choice updated!";
		} catch (Exception e) {
			e.printStackTrace();
			return "choice not updated :(";
		}
	}
}
