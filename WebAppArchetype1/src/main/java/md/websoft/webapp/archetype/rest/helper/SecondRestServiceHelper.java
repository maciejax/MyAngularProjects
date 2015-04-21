package md.websoft.webapp.archetype.rest.helper;

import java.util.ArrayList;
import java.util.List;

import md.websoft.webapp.archetype.dto.MessageDTO;
import md.websoft.webapp.archetype.entities.Message;
import md.websoft.webapp.archetype.service.SecondService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SecondRestServiceHelper {

	//services to inject
	@Autowired
	private SecondService secondService;
	
	
	
	public List<MessageDTO> getMessagesList(){
		List<MessageDTO> transferedList = new ArrayList<MessageDTO>();
		
		List<Message> list = secondService.getMessagesFromDB();
		
		for(Message msg:list){
			transferedList.add(new MessageDTO(msg));
		}
		
		return transferedList;
	}
	
}
