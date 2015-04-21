package md.websoft.webapp.archetype.service;

import java.util.List;

import md.websoft.webapp.archetype.entities.Message;

public interface SecondService {

	List<Message> getMessagesFromDB();
}
