package test;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import javax.ws.rs.core.Application;
import javax.ws.rs.ApplicationPath;

@Path ("/hello")
public class Hello {
	
	@GET
	@Produces(MediaType.TEXT_XML)
	public String sayHello() {
		String resource = "<? version = '1.0?>'"+"<hello> Say Hello </hello>";
		return resource;
	}
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public String sayHelloJ() {
		String resource = null;
		return resource;
	}
	
	@GET
	@Produces(MediaType.TEXT_HTML)
	public String sayHelloH() {
		String resource = "<h1> SAy Heloo from h</h1> ";
		return resource;
	}
}
