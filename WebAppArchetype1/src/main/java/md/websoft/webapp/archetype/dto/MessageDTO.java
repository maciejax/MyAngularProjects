package md.websoft.webapp.archetype.dto;

import javax.xml.bind.annotation.XmlRootElement;

import md.websoft.webapp.archetype.entities.Message;

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
