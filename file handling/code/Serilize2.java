import java.io.*;
class Dog implements Serializable{
    int i=10;
    int j=20;
 
}

class Cat implements Serializable{
    int i=100;
    int j=200;
}
class Main{
public static void main(String []args) throws IOException, ClassNotFoundException{
Dog d=new Dog();
Cat c=new Cat();
System.out.println("Serilization started...");
String fileName="abc.ser";
FileOutputStream fos =new FileOutputStream(fileName );
ObjectOutputStream oos=new ObjectOutputStream(fos);
oos.writeObject(d);
oos.writeObject(c);

System.in.read();
System.out.println("De-Serialization started...");
FileInputStream fis=new FileInputStream(fileName);
ObjectInputStream ois=new ObjectInputStream(fis);
Object obj1=ois.readObject();
Object obj2=ois.readObject();
Dog d1=(Dog)obj1;
Cat c1=(Cat)obj2;
System.out.println(d);
System.out.println(d1);
System.out.println(c);
System.out.println(c1);


}
}