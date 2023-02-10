import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Transient1 {
    public static void main(String []args) throws IOException, ClassNotFoundException{
        FileOutputStream fos=new FileOutputStream("student.ser");
        ObjectOutputStream oos=new ObjectOutputStream(fos);
        
        Student shiva=new Student();
        System.out.println(shiva.name); //before serilization 
        oos.writeObject(shiva);
        
        FileInputStream fis=new FileInputStream("student.ser");
        ObjectInputStream ois =new ObjectInputStream(fis);
        
        Student shivaCopy=(Student)ois.readObject(); 
        
        System.out.println(shivaCopy.name); //after deserilization
        System.out.println(shivaCopy.salary);
        
            }
}

 
 

class Student implements Serializable{
    String name="shiva";
    int age=22;
    transient int salary=1000000;
}