package ResearchAPITesting;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DBConnect {

	
	  public static void main(String arg[]) {
	  
	  //DBConnect getCon = new DBConnect();
	  
	  Connection con = DBConnect.getConnection();
	  
	  DBConnect.
	  insertQuery("Insert into actualtablename\r\n" +
	 "values\r\n" +
	 " ('2021-09-16 02:30',43,1,1', con);
	 
	 DBConnect.closeConnection(con); }
	 
	 
	 
	public static Connection getConnection() {
		Connection con = null;
		try {
			String host = "198.162.162.168";
			String username1 = "saasdfa";
			String password = "asfsdfaa#";

			String formconnectionstring = host + username1 + password;
			String connectionUrl = "jdbc:sqlserver://192.168.162.168;user=saasdfa;password=asfsdfaa";

			con = DriverManager.getConnection(connectionUrl);

			// st = dm.createStatement();
			// System.out.println(st.getConnection().toString());
			// dm.close();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return con;

	}

	public static int insertQuery(String query, Connection con) {
		Statement getst = null;
		int rows = 0;
		try {

			getst = con.createStatement();
			rows = getst.executeUpdate(query);

			System.out.println("Rows inserted:" + rows);
			// System.out.println(st.getConnection().toString());
			// dm.close();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return rows;

	}

	public static void closeConnection(Connection con) {

		try {
			con.commit();
			System.out.println("Connection Closed");
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
