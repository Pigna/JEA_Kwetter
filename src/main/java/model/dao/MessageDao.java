package model.dao;

import model.logic.Message;

import javax.ejb.Stateless;
import java.util.List;
@Stateless
public interface MessageDao {
	List<Message> getMessages();
	void addMessage(Message message);
	void removeMessage(Message message);
}
