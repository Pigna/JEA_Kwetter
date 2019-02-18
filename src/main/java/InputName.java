import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/InputName")
public class InputName extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		processRequest(request, response);
	}
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		processRequest(request, response);
	}

	protected void processRequest(HttpServletRequest request, HttpServletResponse response)
		throws ServletException, IOException {
		response.setContentType("text/html;charset-UTF8");
		try (PrintWriter out = response.getWriter()) {
			out.println("<h1>Servlet InputName at " + request.getContextPath() + "</h1>");
			out.println("<form>"
				+ "Enter your name: "
				+ "<input type=\"text\" name=\"name\">"
				+ "<input type=\"submit\" value=\"submit\">"
				+ "</form>");
			String name = request.getParameter("name");
			if ((name != null) && (name.length() > 0)) {
				RequestDispatcher dispatcher = getServletContext()
						.getRequestDispatcher(
								"/NewServlet");
				dispatcher.forward(request, response);
			}
		}
	}
}
