package com.websoft.rest.helper;

import com.websoft.dto.MessageDTO;
import com.websoft.entity.Message;
import com.websoft.service.SecondService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

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
