package controler;

import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DAO.PendingReqDAO;
import bean.PendingReqBean;

/**
 * Servlet implementation class PendingReq
 */
@WebServlet("/PendingReq")
public class PendingReq extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public PendingReq() {
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
		
		PendingReqDAO prd=new PendingReqDAO();
		
		List<PendingReqBean> list=prd.getResultSet();
		if(!list.isEmpty()){
		request.setAttribute("rs", list);
		}
		else{
			request.setAttribute("msg", "No Request Pending");
		}
		request.getRequestDispatcher("/mid.jsp").forward(request, response);
	}

}
