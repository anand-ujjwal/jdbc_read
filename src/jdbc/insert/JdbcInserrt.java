package jdbc.insert;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class JdbcInserrt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost/student?user=root&password=root");
			
			System.out.println("Enter supplyno,sname,status,city-");
			String suppno=sc.nextLine();
			String sname=sc.nextLine();
			String status=sc.nextLine();
			String city=sc.nextLine();

			PreparedStatement ps=con.prepareStatement("insert into supplier(suppno,sname,status,city) values (  ? , ? , ? ,  ?  )");
			ps.setString(1, suppno);
			ps.setString(2, sname);
			ps.setInt(3, Integer.parseInt(status));
			ps.setString(4, city);
			
			int rs = ps.executeUpdate();
			System.out.println("Row number inserted -" +rs);
			
			
		}
		
catch(Exception e)
		{
	e.printStackTrace();
		}
	}

}
