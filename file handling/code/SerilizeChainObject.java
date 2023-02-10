import java.io.*;
class Dog implements Serializable{
    Cat c=new Cat();
}

class Cat implements Serializable{
    Rat r=new Rat();
}

class Rat{
    int i=20;
}
class Main{
public static void main(String []args) throws IOException, ClassNotFoundException{
Dog d=new Dog();
System.out.println("Serilization started...");
String fileName="abc.ser";
FileOutputStream fos =new FileOutputStream(fileName);
ObjectOutputStream oos=new ObjectOutputStream(fos);
oos.writeObject(d);

System.in.read();
System.out.println("De-Serialization started...");
FileInputStream fis=new FileInputStream(fileName);
ObjectInputStream ois=new ObjectInputStream(fis);
Object obj=ois.readObject();
Dog d1=(Dog)obj;
System.out.println(d);
System.out.println(d1.c.r.i);


}
}