package model.service;

import model.dao.JPA;
import model.dao.MessageDao;
import model.logic.Message;

import javax.ejb.Stateless;
import javax.inject.Inject;
import java.util.List;

@Stateless
public class MessageService {

	@Inject @JPA
	private MessageDao messageDao;

	public MessageService() {
	}

	public List<Message> getMessages() {
		return messageDao.getMessages();
	}

	public void addMessage(Message message) {messageDao.addMessage(message);}

	public void removeMessage(Message message) {messageDao.removeMessage(message);}
}
