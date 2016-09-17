package controler;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DAO.ApprovDAO;
import bean.ApprovBean;
import jdk.management.resource.internal.ApproverGroup;

/**
 * Servlet implementation class Approv
 */
@WebServlet("/Approv")
public class Approv extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Approv() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ApprovBean approvBean=new  ApprovBean();
		approvBean.setUsername(request.getParameter("username"));
		ApprovDAO approv=new ApprovDAO();
		if(approv.appoveReq(approvBean)){
			request.setAttribute("msg", "Successfully  recored added");
		}
		else{
			request.setAttribute("msg", "Something wrong happeneed try after some time later");
		}
		
		request.getRequestDispatcher("/mid.jsp").forward(request, response);	
	}

}
