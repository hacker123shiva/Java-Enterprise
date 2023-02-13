import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Properties;
import java.util.Scanner;

class PropertiesAp{
    public static void main(String []args)throws Exception{
  PreparedStatement pstmt=null;
  Scanner scanner =new Scanner(System.in);
        Properties properties =new Properties();
        properties.setProperty("url","jdbc:mysql:///Students");
        properties.setProperty("user","shiva");
        properties.setProperty("password","root");

        FileOutputStream fos=new FileOutputStream("application.properties");
        properties.store(fos,"shiva storing property for jdbc");

        FileInputStream fis =new FileInputStream("application.properties");
        properties=new Properties();
        properties.load(fis);

        System.out.println("URL IS :: "+properties.getProperty("url"));
        System.out.println("USERNAME IS :: "+properties.getProperty("user"));
        System.out.println("PASSWORD IS :: "+properties.getProperty("password"));
        
        String url=properties.getProperty("url");
        String userName=properties.getProperty("user");
        String password=properties.getProperty("password");

        Connection con=DriverManager.getConnection(url,userName,password);
        System.out.println("Connection object get created");

 String sqlInsertQuery="insert into hons(`name`,`age`,`year`,`address`) values(?,?,?,?)";
    if(con!=null)
  pstmt=con.prepareStatement(sqlInsertQuery);

  if(pstmt!=null){
   System.out.print("Enter name");
   String name=scanner.next();

   System.out.print("Enter age");
   int age=scanner.nextInt();

   System.out.print("Enter year");
   int year=scanner.nextInt();

   System.out.print("Enter address");
   
  }
    
          
      

    }
}