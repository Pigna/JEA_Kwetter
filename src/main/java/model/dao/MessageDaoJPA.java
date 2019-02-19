package model.dao;

import model.logic.Message;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;


@Stateless @JPA
public class MessageDaoJPA implements MessageDao{

	@PersistenceContext(unitName = "jeaPU")
	private EntityManager em;

	@Override
	public List<Message> getMessages() {
		return  em.createQuery("SELECT m FROM Message m").getResultList();
	}

	@Override
	public void addMessage(Message message) { em.persist(message);}

	@Override
	public void removeMessage(Message message) {
		em.remove(em.merge(message));
	}
}
