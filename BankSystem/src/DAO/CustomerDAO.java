package DAO;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import bean.CustomerBean;
import bean.PendingReqBean;

public class CustomerDAO {
	
	public List<CustomerBean> getResult() {
		Connection conn=null;
		Statement stmt=null;
		ResultSet rs=null;
		
		try {
			conn=DB_Connection.getConnection();
			stmt=conn.createStatement();
			rs=stmt.executeQuery("SELECT *from c_account where type='cust'");
			List<CustomerBean> list=new ArrayList<CustomerBean>();
			try {
				while(rs.next()){
					
					CustomerBean bean=new CustomerBean(rs);
					list.add(bean);
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return list;
		} catch (ClassNotFoundException e) {
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
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
