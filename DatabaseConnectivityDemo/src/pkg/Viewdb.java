package pkg;
import java.sql.*;
public class Viewdb {
	public static void main(String[] args) {
		String url="jdbc:mysql://127.0.0.1:3306/Users";
		String usr="root";
		String pwd="mani";
		String Query = "SELECT * FROM userdetails";
		try {
		Connection con = DriverManager.getConnection(url,usr,pwd);
		Statement stmt = con.createStatement();
		ResultSet res = stmt.executeQuery(Query);
		while (res.next()) {
			String D1 = res.getString(1);
			String D2 = res.getString(2);
			String D3 = res.getString(3);
			System.out.println("ID : " + D1 + " Name : " + D2 + " Age : " + D3);
		}
		con.close();
		}catch (SQLException e) {
			
			e.printStackTrace();
		}
	}

}


