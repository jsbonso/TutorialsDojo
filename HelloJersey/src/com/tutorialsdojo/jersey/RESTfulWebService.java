package com.tutorialsdojo.jersey;

import javax.ws.rs.*;

@Path("/hello")
public class RESTfulWebService {
	@GET
	@Produces("text/plain")
	public String sayHello(){
		return "Hello Sensei!";
	}
}
