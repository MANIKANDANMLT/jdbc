package pkg;
import java.util.Scanner;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.PreparedStatement;
public class UserInsertDB {
public static void main(String[] args) {
	String url="jdbc:mysql://127.0.0.1:3306/Users";
	String usr="root";
	String pwd="mani";
	try {
		Connection con = DriverManager.getConnection(url, usr, pwd);
		Scanner scan = new Scanner(System.in);
		System.out.println("enter your ID");
		String id = scan.nextLine();
		System.out.println("enter your Name");
		String name = scan.nextLine();
		System.out.println("enter your Age");
		String age = scan.nextLine();
		String query = "INSERT INTO userdetails VALUES(?,?,?)";
		PreparedStatement stmt = con.prepareStatement(query);
		stmt.setString(1, id);
		stmt.setString(2, name);
		stmt.setString(3, age);
		int rowinserted = stmt.executeUpdate();
		if(rowinserted > 0){
			System.out.println("row inserted successfully");
		}
	}catch (Exception e) {
		e.printStackTrace();
	}
}
}
