package phase_1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertRecord {
	
public static void main(String[] args) throws ClassNotFoundException, SQLException {
	
	String dbUrl = "jdbc:mysql://localhost:3306/amazon";
	String username = "root";
	String password = "root";
	String query = " Insert into products Value (\"OnePlus\" , \"NORD_CE2\" , \"Black\" , 19999,6);";
	String query1 = " Insert into products Value (\"OPPO\" , \"A31\" , \"Mystery Black\" , 11990,8);";
	String query2 = " Insert into products Value (\"Redmi\" , \"Sport9A\" , \"Green\" , 6999,2);";
	String query3 = " Insert into products Value (\"Vivo\" , \"Y01\" , \"Blue\" , 8499,3);";
	
	Class.forName("com.mysql.cj.jdbc.Driver");
	Connection con = DriverManager.getConnection(dbUrl,username , password);
	Statement stmt = con.createStatement();
	stmt.execute(query);
	stmt.execute(query1);
	stmt.execute(query2);
	stmt.execute(query3);
	
	System.out.println("NSERTION DONE");
	
}

}
