package com.websoft.service.impl;

import com.websoft.entity.Message;
import com.websoft.service.SecondService;

import javax.inject.Named;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.ArrayList;
import java.util.List;

@Named
public class SecondServiceImpl implements SecondService {

	//@Autowired
	private EntityManager em = null;

	@PersistenceContext
	public void setEntityManager(EntityManager entityManager) {
		this.em = entityManager;
	}

	@SuppressWarnings("unchecked")
	public List<Message> getMessagesFromDB(){

		List<Message> list = em.createNamedQuery("GetTestMessages").getResultList();
		return list;
	}

	List<String> list;

	public List<String> getTextFromDB(){
		if(list == null) {
			list = new ArrayList<String>();
			list.add("Record 1");
			list.add("Record 2");
			list.add("Record 3");
		}

		return list;
	}

	public void clearList(){
		list.clear();

	}


}
