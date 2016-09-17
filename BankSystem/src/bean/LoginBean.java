package bean;

public class LoginBean {
	private String username;
	private String password;
	
	public void setUserName (String username){
		this.username=username;
	}
	public void setPassword(String password){
		this.password=password;
	}
	public String getUerName(){
		return username;
	}
	public String getPassword(){
		return password;
	}
}
