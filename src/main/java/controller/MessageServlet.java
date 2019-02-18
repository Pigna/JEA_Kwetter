package controller;

import model.logic.Message;
import model.logic.MessageProvider;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/message")
public class MessageServlet extends HttpServlet {

	private MessageProvider chatFacade = new MessageProvider();//TODO: injection && use Facade

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	}
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		List<Message> messages = chatFacade.getMessages();

		request.setAttribute("messageList", messages);
		request.getRequestDispatcher("/pages/message.jsp").forward(request, response);
	}

}
