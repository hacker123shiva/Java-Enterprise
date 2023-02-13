import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Properties;

public class Select {
    public static void main(String []args)  throws Exception{
        FileInputStream fis=new FileInputStream("application1.properties");
        Properties pr=new Properties();
        pr.load(fis);

        String url=pr.getProperty("url");
        String userName=pr.getProperty("user");
        String password=pr.getProperty("password");

        Connection con=DriverManager.getConnection(url,userName,password);

        String sqlQuery="Select name from hons where age=?";

        PreparedStatement pstm=con.prepareStatement(sqlQuery);

        pstm.setInt(1,20);

        ResultSet resultset=pstm.executeQuery();
        while(resultset.next()){
            System.out.println("Result: "+resultset.getString("name"));
        }

        con.close();


    }
}
