package preparedstmtstaticprogm;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class InsertTheValues {
	public static void main(String[] args) throws SQLException {
		Connection connection1=DriverManager.getConnection("jdbc:mysql://localhost:3306/jspider","root","root");
		PreparedStatement ps=connection1.prepareStatement("insert into student values(?,?,?)");
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter phone no");
		Long phone=scanner.nextLong();
		ps.setLong(1, phone);
		
		System.out.println("Enter the name");
		String name=scanner.next();
		ps.setString(2, name);
		
		System.out.println("Enter the course");
		String course=scanner.next();
		ps.setString(3, course);
		
		ps.execute();
		
	}

}
