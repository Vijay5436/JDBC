package java1;
import java.sql.*;
import java.util.*;

public class Main1
{
	public static void main(String args[])   throws ClassNotFoundException, SQLException
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Name");
		String Name = s.nextLine();
		System.out.println("Enter Address");
		String Addres = s.nextLine();
		System.out.println("Enter Age");
		int Age = s.nextInt();
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = null;
		con = DriverManager.getConnection("jdbc:mysql://localhost:3306/di","root","");
		Statement st = con.createStatement();
		String sql= "insert into `student` values('"+Name+"','"+Age+"','"+Addres+"')";
		st.execute(sql);
		
		
	}

}