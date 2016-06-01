package test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBCTest {

	/**
	 * @param args
	 * @throws SQLException 
	 * @throws ClassNotFoundException 
	 */
	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
		
		System.loadLibrary("sqljdbc_auth");
		Connection con = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=IDB;integratedSecurity=true;encrypt=true;trustServerCertificate=true");
		System.out.println(con);
		con.close();
	}

}
