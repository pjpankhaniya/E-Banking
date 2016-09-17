package DAO;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import bean.PendingReqBean;
import javafx.stage.StageStyle;


public class PendingReqDAO {
	public List<PendingReqBean> getResultSet() {
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		try {
			conn=DB_Connection.getConnection();
			stmt=conn.createStatement();
			rs=stmt.executeQuery("SELECT *from customer");
			List<PendingReqBean> list=new ArrayList<PendingReqBean>();
			try {
				while(rs.next()){
					PendingReqBean prb=new PendingReqBean(rs);
					list.add(prb);
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return list;
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally{
			try {
				stmt.close();
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return null;
	}
	 
}
