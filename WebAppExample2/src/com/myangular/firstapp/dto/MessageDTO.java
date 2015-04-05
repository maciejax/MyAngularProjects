package com.myangular.firstapp.dto;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="Message")
public class MessageDTO {
	
	private String id;
	private String message;

	
	public MessageDTO(){
	}
	
	public MessageDTO(String msg){
		this.message = msg;
		this.id = "1";
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
	
	
}
