package com.naveen;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.MediaType;



@Path("/helloworld")
public class Authentication{
	private static final String REGISTERED_USERNAME = "naveen";
	private static final String REGISTERED_PASSWORD = "123";
	
	
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	@Path("{username}/{password}")
	public String getHello(@Context HttpHeaders httpHeaders,@PathParam("username") String username,@PathParam("password") String password) {
		System.out.println(username + " " + password);
		if(username.equals(REGISTERED_USERNAME) && password.equals(REGISTERED_PASSWORD)) {
			return "valid user";
		}
		return "invalid user";
		
	}
}
