package com.user.data;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("secured")
public class SecuredUserService {
	
	@GET
	@Path("message")
	@Produces(MediaType.TEXT_PLAIN)
	public String secureMethod() {
		return "this api needs login";
	}
}
