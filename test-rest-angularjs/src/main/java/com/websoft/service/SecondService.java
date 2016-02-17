package com.websoft.service;

import java.util.List;

public interface SecondService {

	List<String> getMessagesFromDB();
	void clearList();
}
