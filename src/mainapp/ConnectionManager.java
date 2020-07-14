package mainapp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionManager {
public Connection getConnection() throws SQLException, ClassNotFoundException
{
	Class.forName("oracle.jdbc.OracleDriver");
	Connection ob=null;
	ob=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1522/orcl","SYSTEM","iamsocool007");
	if(ob!=null)
		System.out.println("ohooooo");
	return ob;
}
}
