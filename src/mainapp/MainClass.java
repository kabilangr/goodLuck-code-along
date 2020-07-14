package mainapp;
import java.io.*;
import java.sql.SQLException;
public class MainClass {
	public static void main(String args[])throws IOException, ClassNotFoundException, SQLException
	{
		System.out.println("1.Register");
		System.out.println("2.Login");
		BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the choice");
		int x=Integer.parseInt(in.readLine());
		RegisterPojo rp=new RegisterPojo();
		RegisterDao rd=new RegisterDao();
		LoginPojo lp=new LoginPojo();
		LoginDao ld=new LoginDao();
		Luck l=new Luck();
		switch(x)
		{
		case 1:
		{
			System.out.println("Entye First name:");
			String firstName=in.readLine();
			System.out.println("Entye Last name:");
			String lastName=in.readLine();
			System.out.println("Entye User name:");
			String userName=in.readLine();
			System.out.println("Entye Password:");
			String password=in.readLine();
			System.out.println("Entye Email:");
			String email=in.readLine();
			rp.setFirstName(firstName);
			rp.setLastName(lastName);
			rp.setUserName(userName);
			rp.setPassword(password);
			rp.setEmail(email);
			rd.addUser(rp);
			break;
		}
		case 2:
		{
			System.out.println("Entye User name:");
			String userName=in.readLine();
			System.out.println("Entye User password:");
			String password=in.readLine();
			lp.setUserName(userName);
			lp.setPassword(password);
			if(ld.validate(lp))
			{
				l.display();
			}
			else
			{
				System.out.println("Crash!!!! wrong user name and password");
			}
			break;
		}
		default:
		{
			
		}
		}
	}
}
