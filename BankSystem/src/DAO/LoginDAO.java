package DAO;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import bean.LoginBean;

public class LoginDAO {

	public String validateLoginParameter(LoginBean lb) {
		String username = lb.getUerName();
		String password = lb.getPassword();

		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		try {
			conn = DB_Connection.getConnection();
			stmt = conn.createStatement();
			rs = stmt.executeQuery("SELECT User_Name,Password,Name,type from c_account");

			while (rs.next()) {
				if (rs.getString("User_Name").equals(username) && rs.getString("Password").equals(password)) {
							
					return rs.getString("Name")+" "+rs.getString("type");
				}
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				stmt.close();
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return "";
	}
}
