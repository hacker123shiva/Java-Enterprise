import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;


public class InstanceOfUseInSerilization {
    public static void main(String []args) throws IOException, ClassNotFoundException{
        FileOutputStream fos=new FileOutputStream("animal.ser");
        ObjectOutputStream oos =new ObjectOutputStream(fos);
        Cat c=new Cat();
        Dog d=new Dog();
        oos.writeObject(c);
        oos.writeObject(d);
        
        FileInputStream fis =new FileInputStream("animal.ser");
        ObjectInputStream ois=new ObjectInputStream(fis);
        
        Object o1=ois.readObject();
        Object o2=ois.readObject();
      
        if(o1 instanceof Cat){
            System.out.println(((Cat)o1).sound);
            System.out.println(((Dog)o2).sound);
        }
       else {
        System.out.println(((Dog)o1).sound);
        System.out.println(((Cat)o2).sound);
       }
        }
         
        
        
            }

 
 
 
 

class Cat implements Serializable{
int catAge=30;
String sound="mee-oow";
}

class Dog implements Serializable{
int dogAge=40;
String sound="bark";
}