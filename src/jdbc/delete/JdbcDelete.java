package jdbc.delete;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class JdbcDelete {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		try
		{
		System.out.println("Enter the supply number to delete recored-");
		String suppno=sc.nextLine();
		
		Class.forName("com.mysql.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost/student?user=root&password=root");
		PreparedStatement ps=con.prepareStatement("delete from supplier where suppno=?");
		ps.setString(1, suppno);
		
		int rs=ps.executeUpdate();
		System.out.println("No. of record deleted-"+rs);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}

}
