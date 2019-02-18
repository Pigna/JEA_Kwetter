package model.logic;

import model.service.MessageService;

import javax.inject.Inject;
import java.util.ArrayList;
import java.util.List;

public class MessageProvider {
	@Inject
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
