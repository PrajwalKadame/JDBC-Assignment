package preparedstmtstaticprogm;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class FetchTheValues {
	public static void main(String[] args) throws SQLException {
		Connection connection1=DriverManager.getConnection("jdbc:mysql://localhost:3306/jspider","root","root");
		PreparedStatement ps=connection1.prepareStatement("Select * from student where phone=?");
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter phone no");
		Long phone=scanner.nextLong();
		ps.setLong(1, phone);
		ResultSet resultset=ps.executeQuery();
		resultset.next();
		System.out.println("phone:"+resultset.getLong(1)+" "+"Name"+resultset.getString(2)+" "+"course"+resultset.getString(3));
		
	}	
	

}
