package jdbc.update;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class JdbcUpdate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		try
		{
			System.out.println("Enter the supply number to update-");
			String suppno=sc.nextLine();
			System.out.println("Enter new city--");
			String city=sc.nextLine();
			
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost/student?user=root&password=root");
			PreparedStatement ps=con.prepareStatement("update supplier set city= ? where suppno = ?");
			ps.setString(1, city);
			ps.setString(2,suppno);
			
			int rs=ps.executeUpdate();
			System.out.println("No.of row updated--" + rs);
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}

	}

}
