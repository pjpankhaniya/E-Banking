package controler;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.simple.JSONObject;

import DAO.RegisterDAO;

/**
 * Servlet implementation class Register
 */
@WebServlet("/Register")
public class Register extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Register() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		JSONObject json=new JSONObject ();
		json.put("name", request.getParameter("name"));
		json.put("email", request.getParameter("email"));
		json.put("username", request.getParameter("username"));
		json.put("password", request.getParameter("password"));
		json.put("BOD", request.getParameter("BirthMonth")+"/"+request.getParameter("BirthDay")+"/"+
		request.getParameter("BirthYear"));
		json.put("mobile", request.getParameter("mobile"));
		json.put("gender", request.getParameter("gender"));
		RegisterDAO rDAO=new RegisterDAO();
		boolean result=rDAO.doRegister(json);
		
		if(result){
			request.setAttribute("errMessage", "registration successful");
			request.getRequestDispatcher("/index.jsp").forward(request, response);
		}
		else{
			request.setAttribute("errMessage", "All field are required ");
			request.getRequestDispatcher("/Register.jsp").forward(request	, response);
		}
	}
}
