package model.service;

import model.dao.JPA;
import model.dao.MessageDao;
import model.logic.Message;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import java.util.List;

@Stateless
public class MessageService {

	@EJB @JPA
	private MessageDao messageDao;

	public List<Message> getMessages() {
		return messageDao.getMessages();
	}

	public void addMessage(Message message) {messageDao.addMessage(message);}

	public void removeMessage(Message message) {messageDao.removeMessage(message);}
}
