package com.myangular.firstapp.ro;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import com.myangular.firstapp.dto.PersonDTO;

@XmlRootElement(name="Person")
public class PersonResponse {
	
	@XmlElement(name="p")
	public List<PersonDTO> prsList;

	public PersonResponse(){
	}

	public PersonResponse(List<PersonDTO> list){
		this.prsList = list;
	}
	
	public List<PersonDTO> getPrsList() {
		return prsList;
	}

	public void setList(List<PersonDTO> list) {
		this.prsList = list;
	}
	
	
}
