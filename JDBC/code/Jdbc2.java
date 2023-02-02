 
import java.sql.*;
import com.mysql.cj.jdbc.Driver; 
  class Main {
    public static void main(String []args){
    	 //Step:1 load and register the Driver
         try{
            Driver driver =new Driver(); //Create Driver object for MySQLDB
            DriverManager.registerDriver(driver);
            System.out.println("Driver registerd succesfully");}
   
            catch(SQLException e)
            {
             System.out.println(e);
            }
        }
    
}
