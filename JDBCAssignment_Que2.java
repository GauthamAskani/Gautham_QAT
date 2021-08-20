import java.sql.*;


public class JDBCAssignment_Que2 {

	public static void main(String[] args)  throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		String url = "jdbc:oracle:thin:@localhost:1521/XEPDB1";
		String username = "SYSTEM";
		String password = "oracle123";
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection connect = DriverManager.getConnection(url,username,password);
		System.out.println("connection created");
		Statement s1 = connect.createStatement();
		String updateQuery = "UPDATE OFFICE1 SET EMPLOYEE_NAME = 'KOHLI' WHERE ID = 3";
		s1.executeUpdate(updateQuery);
		ResultSet result = s1.executeQuery("SELECT*FROM OFFICE1");
		System.out.println("query execution" + result);
		
        while(result.next()){
			
			System.out.println(result.getString("ID") +":"+ result.getString("EMPLOYEE_NAME"));
			
		}
		
			connect.close();

	}

}
