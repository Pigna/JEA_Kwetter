package model.logic;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

@Entity
@Table(name = "messages")
public class Message implements Serializable {
	@Id @GeneratedValue
	private long id;
	@Column
	private String message;
	private Date date;

	public Message(String message) {
		this.message = message;
	}

	public Message() {
	}

	public long getId() {
		return id;
	}

	public String getMessage() {
		return message;
	}

	public Date getDate() {
		return date;
	}

	public void setId(long id) {
		this.id = id;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public void setDate(Date date) {
		this.date = date;
	}

}
