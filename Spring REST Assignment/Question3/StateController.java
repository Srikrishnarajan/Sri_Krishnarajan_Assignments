package com.naveen;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.springframework.beans.factory.annotation.Autowired;


import com.naveen.State;


@Path("/helloworld")
public class StateController {

		StateService stateService=new StateService();
	@GET
	@Produces(MediaType.APPLICATION_XML)
	@Path("/state")
	public List<State> getStates() {
		return stateService.getAllStates();

	}
	@GET
	@Produces(MediaType.APPLICATION_XML)
	@Path("/{zipCode}")
	public State getState(@PathParam("zipCode") Long zipCode) {
		return stateService.getState(zipCode);

	}
	
}

