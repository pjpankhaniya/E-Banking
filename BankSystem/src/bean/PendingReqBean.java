package bean;

import java.sql.ResultSet;
import java.sql.SQLException;

public class PendingReqBean {
	private String name;
	private String mobile1;
	private String mobile2;
	private String gender;
	private String status;
	private String email;
	private String username;
	private String password;
	private String BOD;

	public void setName(String name) {
		this.name = name;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setBOD(String BOD) {
		this.BOD=BOD;
	}

	public void setMobile1(String mobile1) {
		this.mobile1 = mobile1;
	}

	public void setMobile2(String mobile2) {
		this.mobile2 = mobile2;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public void setSatus(String status) {
		this.status = status;
	}

	public String getName() {
		return name;
	}

	public String getMobile1() {
		return mobile1;
	}

	public String getMobile2() {
		return mobile2;
	}

	public String getGender() {
		return gender;
	}

	public String getStatus() {
		return status;
	}

	public String getEmail() {
		return email;
	}

	public String getPassword() {
		return password;
	}

	public String getUsername() {
		return username;
	}

	public String getBOD() {
		return BOD;
	}
	public PendingReqBean(ResultSet rs) throws SQLException {
		this.name = rs.getString("Name");
		this.mobile1 = rs.getString("Mobile1");
		this.mobile2 = rs.getString("Mobile2");
		this.gender = rs.getString("Gender");
		this.status = rs.getString("Status");
		this.email=rs.getString("Email");
		this.username=rs.getString("UserName");
		this.password=rs.getString("Password");
		this.BOD=rs.getString("BOD");
	}
}
