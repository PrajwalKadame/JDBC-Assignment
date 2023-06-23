package preparedstmtstaticprogm;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class UpdateTheValue {
	public static void main(String[] args) throws SQLException {
		Connection connection1=DriverManager.getConnection("jdbc:mysql://localhost:3306/jspider","root","root");
		PreparedStatement ps=connection1.prepareStatement("update student set name=? where phone=?");
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the name");
		String name=scanner.next();
		ps.setString(1, name);
		
		
		System.out.println("Enter phone no");
		Long phone=scanner.nextLong();
		ps.setLong(2, phone);
		
		ps.execute();
		
		System.out.println("The values are updated");
	}

}
