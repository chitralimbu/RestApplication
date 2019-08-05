package com.user.data;

import java.util.List;

import javax.ws.rs.ext.Provider;

import com.sun.jersey.spi.container.ContainerRequest;
import com.sun.jersey.spi.container.ContainerRequestFilter;


@Provider
public class SecurityFilter implements ContainerRequestFilter{
	private static final String AUTHORIZATION_HEADER_KEY = "Authorization";
	private static final String AUTHORIZATION_HEADER_PREFIX = "Basic ";
	@Override
	public ContainerRequest filter(ContainerRequest requestContext) {
		return null;
	}

	
}
