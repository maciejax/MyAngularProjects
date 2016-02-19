package com.websoft.service;

import com.websoft.entity.Message;

import java.util.List;

public interface SecondService {

	List<String> getTextFromDB();
	List<Message> getMessagesFromDB();

	void clearList();
}
