package mainapp;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class RegisterDao {
	public void addUser(RegisterPojo rp) throws ClassNotFoundException, SQLException
	{
		String fname=rp.getFirstName();
		String lname=rp.getLastName();
		String uname=rp.getUserName();
		String pass=rp.getPassword();
		String email=rp.getEmail();
		ConnectionManager cm=new ConnectionManager();
		String sql="insert into USERDETAILS(FIRSTNAME,LASTNAME,USERNAME,PASSWORD,EMAIL)VALUES(?,?,?,?,?)";
		PreparedStatement st=cm.getConnection().prepareStatement(sql);
		st.setString(1, fname);
		st.setString(2, lname);
		st.setString(3, uname);
		st.setString(4, pass);
		st.setString(5, email);
		st.executeUpdate();
		cm.getConnection().close();
	}

}
