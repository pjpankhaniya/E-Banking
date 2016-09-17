package controler;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import DAO.LoginDAO;
import bean.LoginBean;

/**
 * Servlet implementation class Login
 */
@WebServlet("/Login")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private String profile;
	private String username;
	private String password;

	public Login() {
		// TODO Auto-generated constructor stub
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)

			throws ServletException, IOException {
		
		username = request.getParameter("username");
		password = request.getParameter("password");

		LoginBean lb = new LoginBean();
		lb.setUserName(username);
		lb.setPassword(password);
		LoginDAO lDAO = new LoginDAO();
		String result[] = lDAO.validateLoginParameter(lb).split(" ");
		HttpSession session = request.getSession(false);
		if (!result[0].isEmpty()) {
			if(result[1].equals("emp")){
				session.setAttribute("name", result[0]);
				request.setAttribute("name", result[0]);
				request.getRequestDispatcher("Admin").forward(request, response);
			}
			else{
				session.setAttribute("name", username);
				request.getRequestDispatcher("Profile").forward(request, response);
			}
		} else {
			if (session == null) {
				response.sendRedirect(request.getContextPath() + "/index.jsp");
				request.getRequestDispatcher("/index.jsp").forward(request, response);
			} else {
				request.setAttribute("errMessage", "Please enter valid username or password!");
				request.getRequestDispatcher("/index.jsp").forward(request, response);
			}
		}
	}
}
