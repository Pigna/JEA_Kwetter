package controller;

import model.logic.MessageProvider;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/newmessage")
public class NewMessageServlet extends HttpServlet {

	@EJB
	private MessageProvider chatFacade;


	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String newMessage = request.getParameter("new_message");
		chatFacade.addMessage(newMessage);
		request.setAttribute("newMessage", newMessage);
		request.getRequestDispatcher("/pages/newmessage.jsp").forward(request, response);
	}
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	}
}
