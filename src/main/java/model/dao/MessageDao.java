package model.dao;

import model.logic.Message;
import java.util.List;

public interface MessageDao {
	List<Message> getMessages();
	void addMessage(Message message);
	void removeMessage(Message message);
}
