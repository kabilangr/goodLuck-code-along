package mainapp;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class LoginDao {

	public boolean validate(LoginPojo lp) throws ClassNotFoundException, SQLException {
String uname=lp.getUserName();
String pass=lp.getPassword();
ConnectionManager cm=new ConnectionManager();
Statement st=cm.getConnection().createStatement();
ResultSet rs=st.executeQuery("SELECT * FROM USERDETAILS");
while(rs.next())
{
	if((uname.equals(rs.getString("USERNAME")))&&(pass.equals(rs.getString("PASSWORD"))))
	{
		cm.getConnection().close();
		return true;
	}
}
		return false;
	}

}
