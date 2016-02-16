package com.websoft.service.impl;

import com.websoft.service.SecondService;

import javax.inject.Named;
import java.util.ArrayList;
import java.util.List;

@Named
public class SecondServiceImpl implements SecondService {

	List<String> list;

	public List<String> getMessagesFromDB(){
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
