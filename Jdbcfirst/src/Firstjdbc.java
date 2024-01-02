import java.sql.*;


public class Firstjdbc {
	
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			String url="jdbc:mysql://loclhost:3306/rays";
			String user="root";
			String password="root";
			Connection conn=DriverManager.getConnection(url, user, password);
			
			if(conn.isClosed()) {
				System.out.println("shailendra bnd he");
			}else {
				System.out.println("koi dikkt nhi he");
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	

}
