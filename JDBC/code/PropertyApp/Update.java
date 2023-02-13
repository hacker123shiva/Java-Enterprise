import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Properties;

public class Update {
    public static void main(String []args) throws Exception{
        FileInputStream fis =new FileInputStream("application1.properties");
        Properties pr=new Properties();
        pr.load(fis);

        String url=pr.getProperty("url");
        String userName=pr.getProperty("user");
        String password=pr.getProperty("password");

        Connection con=DriverManager.getConnection(url,userName,password);
        System.out.println("Connection get established");
        String sqlQuery="update hons set name=? where name='shiva'";
        PreparedStatement pstm=con.prepareStatement(sqlQuery);
        pstm.setString(1, "Shiva Srivastava");
        pstm.executeUpdate();
        System.out.println("PreparedStatement get executed");
        con.close();
    }
}
