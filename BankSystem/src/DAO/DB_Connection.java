package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DB_Connection {

	private static String url = "jdbc:mysql://localhost:3306/bank";
	private static String username = "paresh";
	private static  String password = "paresh";
	private static Connection connection=null;
	public static Connection getConnection() throws ClassNotFoundException {

		try {
			Class.forName("com.mysql.jdbc.Driver");
			connection= DriverManager.getConnection(url, username, password);
		} catch (SQLException e) {
			throw new IllegalStateException("Cannot connect the database!", e);
		} catch (ClassNotFoundException e) {
			throw new ClassNotFoundException("cannot connect to database");
		}
		return connection;
	}
}
