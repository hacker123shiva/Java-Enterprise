import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Properties;
public class PropertiesApp {
    public static void main(String []args) throws Exception{
        // FileOutputStream fos =new FileOutputStream("application.properties");
        Properties pr=new Properties();
        pr.setProperty("url","jdbc:mysql://localhost:3306/Students");
        pr.setProperty("user","shiva");
        pr.setProperty("password","root");
        FileOutputStream fos =new FileOutputStream("application1.properties");
        pr.store(fos,"shiva storing property for jdbc"); 
        System.out.println("Storing Succesful");
        
        FileInputStream fis =new FileInputStream("application1.properties");
        pr=new Properties();
        pr.load(fis);
        System.out.println("Loading Succesful");
     
        
        String url=pr.getProperty("url");
        String username=pr.getProperty("user");
        String password=pr.getProperty("password");

        Connection con=DriverManager.getConnection(url,username,password);
        System.out.println("Connection established");

        String sqlQuery="insert into hons(`name`,`age`,`year`,`address`) values(?,?,?,?)";
        PreparedStatement pstm=con.prepareStatement(sqlQuery);
        System.out.println("Statement get prepared"); 

        pstm.setString(1,"Muskan Garg");
        pstm.setInt(2,20);
        pstm.setInt(3,2003);
        pstm.setString(4,"Agra");

        pstm.executeUpdate();
        System.out.println("Statment get executed");
        
        pstm.setString(1,"Harsh Srivastava");
        pstm.setInt(2,21);
        pstm.setInt(3,2002);
        pstm.setString(4,"Ballia");

        pstm.executeUpdate();
        System.out.println("Statment get executed");






  
        






    }
}
