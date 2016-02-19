package com.websoft.rest.service;

import com.websoft.dto.MessageDTO;
import com.websoft.rest.helper.SecondRestServiceHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.List;


@Component
@Path("/info")
public class SecondRestService {
    
    @Autowired
    SecondRestServiceHelper secondRestServiceHelper;
    
    //@Autowired
    //AuthenticationHelper authenticationHelper;
    //RestTestingBean restTestingBean;
    
    /*@GET
    @Path("/websoft")
    @Produces(MediaType.APPLICATION_JSON)
    public Response info() {
        
        String result = restTestingBean.testInfo();
        
        return Response.status(200).entity(result).build();
    }*/
    
    @GET
    @Path("/web")
    @Produces(MediaType.APPLICATION_JSON)
    public List<MessageDTO> getTestMessage() {
    	
    		return secondRestServiceHelper.getMessagesList();
    }


    /*@GET
    @Path("/web")
    @Produces(MediaType.APPLICATION_JSON)
    public List<MessageDTO> getTestMessage() throws AuthenticationException {

        if(authenticationHelper.validateToken()){
            return secondRestServiceHelper.getMessagesList();
        } else {
            throw new AuthenticationException();
        }

    }*/

}
