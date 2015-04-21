package md.websoft.webapp.archetype.rest.service;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import md.websoft.webapp.archetype.dto.MessageDTO;
import md.websoft.webapp.archetype.rest.helper.SecondRestServiceHelper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component
@Path("/info")
public class SecondRestService {
    
    @Autowired
    SecondRestServiceHelper secondRestServiceHelper;
    
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
    
}
