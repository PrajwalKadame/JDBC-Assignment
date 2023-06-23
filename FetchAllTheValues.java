package preparedstmtstaticprogm;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class FetchAllTheValues {
	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection1=DriverManager.getConnection("jdbc:mysql://localhost:3306/jspider","root","root");
		PreparedStatement ps=connection1.prepareStatement("Select * from student where phone in(?,?)");
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter phone no");
		Long phone=scanner.nextLong();
		ps.setLong(1, phone);
		
		System.out.println("Enter phone no");
		Long phone1=scanner.nextLong();
		ps.setLong(2, phone1);
		
		ResultSet resultset=ps.executeQuery();
			while(resultset.next()){
		
		System.out.println("phone:"+resultset.getLong(1)+" "+"Name"+resultset.getString(2)+" "+"course"+resultset.getString(3));
		}
	}	

}
