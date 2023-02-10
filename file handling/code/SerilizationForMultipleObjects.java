import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class SerilizationForMultipleObjects {
    public static void main(String []args) throws IOException, ClassNotFoundException{
FileOutputStream fos=new FileOutputStream("animal.ser");
ObjectOutputStream oos =new ObjectOutputStream(fos);
Cat c=new Cat();
Dog d=new Dog();
oos.writeObject(c);
oos.writeObject(d);

FileInputStream fis =new FileInputStream("animal.ser");
ObjectInputStream ois=new ObjectInputStream(fis);

Cat c1=(Cat)ois.readObject();
Dog d1=(Dog)ois.readObject();

System.out.println(c1.sound);
System.out.println(d1.sound);

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