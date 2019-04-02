package com.example.dobri.SimpleEchoer;

import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
 

@Produces(MediaType.APPLICATION_JSON)
public class EchoerService {
	
	@GET
    @Path("/")
    public EchoMessage getEchoMessage(@Context HttpServletRequest request, @QueryParam("text") String text) {
    	String user = request.getRemoteUser();
		EchoMessage message = new EchoMessage(user, text);
 
        return message;
    }
}