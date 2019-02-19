package controller;

import model.logic.Message;
import model.logic.MessageProvider;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/message")
public class MessageServlet extends HttpServlet {
	@EJB
	private MessageProvider mProvider;

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	}
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		List<Message> messages = mProvider.getMessages();


//		PrintWriter out = response.getWriter();
//
//				String name = "";
//		InitialContext ctx = null;
//		try {
//			ctx = new InitialContext();
//			DataSource ds = (DataSource)ctx.lookup("java:/MySqlDS");
//			Connection conn = ds.getConnection();
//			PreparedStatement prep = conn.prepareStatement("Select message from messages where id = 1");
//			ResultSet rs = prep.executeQuery();
//			if (rs.next()) {
//				name = rs.getString("message");
//			}
//		} catch (NamingException e) {
//			e.printStackTrace();
//			out.println(e.toString());
//		} catch (SQLException e) {
//			e.printStackTrace();
//			out.println(e.toString());
//		}
//		ArrayList<Message> messages = new ArrayList<Message>();
//		messages.add(new Message(name));
//

		request.setAttribute("messageList", messages);
		request.getRequestDispatcher("/pages/message.jsp").forward(request, response);
	}

}
