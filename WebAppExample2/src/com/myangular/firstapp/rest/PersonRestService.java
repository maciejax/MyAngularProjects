package com.myangular.firstapp.rest;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.myangular.firstapp.db.InMemoryDB;
import com.myangular.firstapp.dto.MessageDTO;
import com.myangular.firstapp.dto.PersonDTO;
import com.myangular.firstapp.ro.PersonResponse;

@Path("/person")
public class PersonRestService {
	
	public InMemoryDB db = new InMemoryDB(true);

	
	/** ========================================================== */

	public PersonRestService () throws IOException{
		//db.populateWithTestData();
	}
	
	@GET
	@Path("/testservice")
	@Produces(MediaType.APPLICATION_JSON)
    public MessageDTO getTestMessage() {
		
		MessageDTO msg = new MessageDTO("RESTEasy call successful:)");
        
		return msg;
    }
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public PersonResponse getAllPersons(){
		
		
		List<PersonDTO> list = new ArrayList<PersonDTO>();
		//list.add(map.get(1L));
		//list.add(map.get(2L));
		list.add(new PersonDTO(1L, "Nicki Pedersen", 36));
		list.add(new PersonDTO(2L, "Tomasz Gollob", 42));
		
		//return list;
		return new PersonResponse(list);
	}
}
