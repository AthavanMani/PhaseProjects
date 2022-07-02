package phase_1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class RetriveDataFromDB {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		
		String dbUrl = "jdbc:mysql://localhost:3306/amazon";
		String username = "root";
		String password = "root";
		String query = "Select * from products;";
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection(dbUrl,username , password);
		Statement stmt = con.createStatement();
		ResultSet rs = stmt.executeQuery(query);
		
		while (rs.next()) {
			
			System.out.print("Brand:"+rs.getString("brand")+"\t" );
			System.out.print("ModelName:"+rs.getString("model_name")+"\t");
			System.out.print("Color:"+rs.getString("color")+"\t");			
			System.out.print("Sold_Price:"+rs.getString("price")+"\t");
			System.out.println("Ram_Size:"+rs.getString("ram_size")+"\t");
			System.out.println();

		}
		


	}

}
