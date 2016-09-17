package DAO;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import bean.ApprovBean;

public class ApprovDAO {
	private String name;
	private String mobile1;
	private String mobile2;
	private String gender;
	
	private String email;
	private String password;
	private String BOD;

	public  boolean appoveReq(ApprovBean approvBean) {
		Connection conn=null;
		Statement stmt=null;
		ResultSet rs=null;
		
		try {
			conn=DB_Connection.getConnection();
			stmt=conn.createStatement();
			rs=stmt.executeQuery("SELECT *from customer WHERE UserName='"+approvBean.getUsername()+"'");
			while(rs.next()){
			name=rs.getString("Name");
			mobile1=rs.getString("Mobile1");
			mobile2=rs.getString("Mobile2");
			gender=rs.getString("Gender");
			email=rs.getString("Email");
			password=rs.getString("Password");
			BOD=rs.getString("BOD");}
			int result=stmt.executeUpdate("DELETE FROM customer WHERE UserName='"+approvBean.getUsername()+"'");
			if(result<=0){
				System.out.println("delete");
				return false;
			}
			String query="INSERT INTO c_account (Name,Mobile1,Mobile2,Current_Balance,User_Name,Password,type,BOD,Gender,Email)"+
			" VALUE ('"+name+"','"+mobile1+"','"+mobile2+"','"+500+"','"+approvBean.getUsername()+"','"+password+
			"','cust','"+BOD+"','"+gender+"','"+email+"')";
			int insert=stmt.executeUpdate(query);
			if(insert>0){
				return true;
			}
			
		} catch (ClassNotFoundException e) {
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}

}
