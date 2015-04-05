package com.myangular.firstapp.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import com.myangular.firstapp.dto.MessageDTO;

@Path("/firstservice")
public class FirstRestService {

	@GET
	@Produces("application/json")
    public MessageDTO getTestMessage() {
		
		MessageDTO msg = new MessageDTO("RESTEasy call successful:)");
        
		return msg;
    }
}
