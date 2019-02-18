package model.logic;

import model.service.MessageService;

import javax.ejb.EJB;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import java.util.ArrayList;
import java.util.List;
@Stateless @LocalBean @EJB(beanInterface = MessageProvider.class, name = "MessageProvider")
public class MessageProvider {
	@EJB
	MessageService messageService;

	public List<Message> getMessages()
	{
		//List<Message> messages = messageService.getMessages();

		List<Message> messages = new ArrayList<>();
		messages.add(new Message("test1"));
		messages.add(new Message("test2"));



		return messages;
	}

	public void addMessage(String message)
	{
		Message newMessage = new Message(message);
		messageService.addMessage(newMessage);
	}
}
