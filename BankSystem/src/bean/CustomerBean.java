package bean;

import java.sql.ResultSet;
import java.sql.SQLException;

public class CustomerBean {
	private String name;
	private String username;

	public void setname(String name) {
		this.name = name;
	}
	public void username(String Uername) {
		this.username = username;
	}
	public String getname(){
			return name;
	}
	public String getusername(){
		return username;
	}
	public CustomerBean(ResultSet rs) throws SQLException {
		this.name=rs.getString("name");
		this.username=rs.getString("User_name");
	
	}

}
