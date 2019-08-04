package jdbc.read.conditinal;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class JdbcReadWithParameter {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		// TODO Auto-generated method stub
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost/student?user=root&password=root");

			System.out.println("Enter the city name--");
			String x=sc.nextLine();
			
			PreparedStatement ps=con.prepareStatement("SELECT * from supplier where city = ?");
			ps.setString(1, x);
			
			ResultSet rs=ps.executeQuery();
			int sum=0,count=0;
			while(rs.next())
			{
				
				System.out.println(rs.getString(1) + " " +rs.getString(2) + " " +rs.getInt(3) + " " + rs.getString(4));
				sum+=rs.getInt(3);
				count++;
			}
		 int avg=sum/count;
		 System.out.println("Average marks is-"+ avg);
 
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
