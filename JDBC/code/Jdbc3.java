import java.sql.*;
/*import com.mysql.cj.jdbc.Driver;
class Main
{
	public static void main(String []args){
		try{
             Driver driver =new Driver();
             DriverManager.registerDriver(driver);
             System.out.println("Driver loaded and registered succesfully");
		}

		catch(SQLException e){
			System.out.println(e);
		}

}

}
*/

class Main
{
	public static void main(String []args){
		try{
              Class.forName("com.mysql.cj.jdbc.Driver");
			  System.out.println("Driver is loaded succesfully");

			  //make connection 
/*
  public static java.sql.Connection getConnection(java.lang.String, java.util.Properties) throws java.sql.SQLException;
  public static java.sql.Connection getConnection(java.lang.String, java.lang.String, java.lang.String) throws java.sql.SQLException;
  public static java.sql.Connection getConnection(java.lang.String) throws java.sql.SQLException;
 */
 String url="jdbc:mysql://localhost:3306/Students";
 String userName="shiva";
 String passwd="root";
			  DriverManager.getConnection(url,userName,passwd);
			  System.out.println("connection established");


		}

		catch(ClassNotFoundException e){
			System.out.println(e);
		}

		catch(SQLException e){
			System.out.println(e);

}

}
}