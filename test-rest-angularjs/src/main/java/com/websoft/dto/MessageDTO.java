package com.websoft.dto;

import com.websoft.entity.Message;

import javax.xml.bind.annotation.XmlRootElement;


@XmlRootElement(name="Message")
public class MessageDTO {
	
	private String id;
	private String message;

	
	public MessageDTO(){
	}
	
	public MessageDTO(Message msg){
		transferToDto(msg);
	}
	
	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
	
	private void transferToDto(Message msg){
		this.id = msg.getId();
		this.message = msg.getMessage();
	}
	
}
