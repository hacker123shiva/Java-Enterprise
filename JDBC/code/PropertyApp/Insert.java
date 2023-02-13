 

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Properties;
public class Insert {
    public static void main(String []args) throws Exception{
        FileInputStream fis=new FileInputStream("application1.properties");
        Properties pr=new Properties(); 
        pr.load(fis);
        //establish connection
        String url=pr.getProperty("url");
        String userName=pr.getProperty("user");
        String password=pr.getProperty("password");
       Connection con= DriverManager.getConnection(url,userName,password);
        System.out.println("Connection created ");
        String sqlQuery="insert into hons(`name`,`age`,`year`,`address`) values(?,?,?,?)";
        PreparedStatement pstm=con.prepareStatement(sqlQuery);
   
        pstm.setString(1,"Abhimanyu");
        pstm.setInt(2,20);
        pstm.setInt(3,2003);
        pstm.setString(4,"Ballia");

        pstm.executeUpdate();
        System.out.println("preparedStatement get executed");
        con.close();
        }
        
    }
