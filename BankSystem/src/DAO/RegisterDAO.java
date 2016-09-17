package DAO;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import org.json.simple.JSONObject;

public class RegisterDAO {

	public boolean doRegister(JSONObject json) {
		Connection conn = null;
		Statement stmt = null;
		
		try {
			conn=DB_Connection.getConnection();
			stmt=conn.createStatement();
			String query="INSERT INTO customer (Name,Mobile1,Mobile2,Gender,Status,UserName,Password,Email,BOD)"+
			" VALUE('"+json.get("name")+"' , '"+json.get("mobile")+"' , '"+json.get("mobile")+"' , '"
					+json.get("gender")+"' , '"+" waiting '"+ ",'"+json.get("username")+
					"','"+json.get("password")+"','"+json.get("email")+"','"+json.get("BOD")+"') ";
			
			//System.out.println(query);
			int result=stmt.executeUpdate(query);
			return result >0?true : false;
		} catch (ClassNotFoundException e) {
		
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
		return false;
	}

}
