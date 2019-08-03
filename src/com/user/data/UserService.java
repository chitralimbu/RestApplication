package com.user.data;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/UserService")
public class UserService {

	UserDao userDao = new UserDao();
	
	@GET
	@Produces(MediaType.APPLICATION_XML)
	public List<User> getUsers(){
		return userDao.getAllUsers();
	}
	
	@Path("/json")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<User> getUsersJson(){
		return userDao.getAllUsers();
	}
	
	@Path("/json/{name}")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Response getUserJson(@PathParam("name") String name){
		return Response.status(200).entity(userDao.getUserByName(name)).build();
	}
}
