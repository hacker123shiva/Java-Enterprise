import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class CustomizeSerilization {
    public static void main(String []args) throws IOException, ClassNotFoundException{
FileOutputStream fos=new FileOutputStream("userAccount");
ObjectOutputStream oos=new ObjectOutputStream(fos);
Account shiva=new Account("PARK1234GFHR", "3456","shiva");
oos.writeObject(shiva);

FileInputStream fis =new FileInputStream("userAccount");
ObjectInputStream ois =new ObjectInputStream(fis);

Account ac=(Account)ois.readObject();
System.out.println(ac.getUserName());
System.out.println(ac.getPsswd());
    }
}

class Account implements Serializable{
  private String accNumber="BARO1234GHJO";
  transient private String psswd="shivaSrivastava";
  private String userName="hackerShiva";

  Account (String accNumber,String psswd,String userName){
    this.accNumber=accNumber;
    this.psswd=psswd;
    this.userName=userName;
  }

 
  private void writeObject(ObjectOutputStream oos) throws Exception{
String encr="@123"+psswd;
oos.defaultWriteObject();
oos.writeObject(encr);
  }

  private void readObject(ObjectInputStream ois) throws Exception{
    ois.defaultReadObject();
String encr=(String) ois.readObject();
psswd =encr.substring(4);
  }

public String getAccNumber() {
    return accNumber;
}
public void setAccNumber(String accNumber) {
    this.accNumber = accNumber;
}
public String getPsswd() {
    return psswd;
}
public void setPsswd(String psswd) {
    this.psswd = psswd;
}
public String getUserName() {
    return userName;
}
public void setUserName(String userName) {
    this.userName = userName;
}

  
}



/*
without coustomizeSerilization and transient hacker can get critical information if we use transient as per our need we cannot get password

public class CustomizeSerilization {
    public static void main(String []args) throws IOException, ClassNotFoundException{
FileOutputStream fos=new FileOutputStream("userAccount");
ObjectOutputStream oos=new ObjectOutputStream(fos);
Account shiva=new Account("PARK1234GFHR", "3456","shiva");
oos.writeObject(shiva);

FileInputStream fis =new FileInputStream("userAccount");
ObjectInputStream ois =new ObjectInputStream(fis);

Account ac=(Account)ois.readObject();
System.out.println(ac.getUserName());
System.out.println(ac.getPsswd());
    }
}

class Account implements Serializable{
  private String accNumber="BARO1234GHJO";
  private String psswd="shivaSrivastava";
  private String userName="hackerShiva";

  Account (String accNumber,String psswd,String userName){
    this.accNumber=accNumber;
    this.psswd=psswd;
    this.userName=userName;
  }
public String getAccNumber() {
    return accNumber;
}
public void setAccNumber(String accNumber) {
    this.accNumber = accNumber;
}
public String getPsswd() {
    return psswd;
}
public void setPsswd(String psswd) {
    this.psswd = psswd;
}
public String getUserName() {
    return userName;
}
public void setUserName(String userName) {
    this.userName = userName;
}

  
} 

 */