package jdbc.read.all;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement; 

class JdbcShowAllRecords{  
public static void main(String ar[]){  
 try{  
	   Class.forName("com.mysql.jdbc.Driver");  
	   Connection con =DriverManager.getConnection("jdbc:mysql://localhost/student?user=root&password=root");  
	   Statement st= con.createStatement();  
	   ResultSet rs=st.executeQuery("select * from supplier");  
	   System.out.println("Print All Content:");
	   while(rs.next()){  
	    System.out.println(
	    		rs.getString("suppno") + ", "
	    		+ rs.getString(2) + ", "
	    		+ rs.getString(3) + ", "
	    		+ rs.getString(4));  
	   }  
	  
	}catch(Exception ee){System.out.println(ee);}  
	  
	}
}	  