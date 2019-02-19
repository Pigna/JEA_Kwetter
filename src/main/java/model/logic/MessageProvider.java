package model.logic;

import model.service.MessageService;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import java.util.List;

@Stateless
public class MessageProvider {

	@EJB
	MessageService messageService;

	public List<Message> getMessages()
	{
		List<Message> messages = messageService.getMessages();

		return messages;
	}

	public void addMessage(String message)
	{
		Message newMessage = new Message(message);
		messageService.addMessage(newMessage);
	}
}
