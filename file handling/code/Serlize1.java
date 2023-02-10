import java.io.*;
class Dog implements Serializable{
    int i=10;
    int j=20;
    static {
        System.out.println("static block get executed");
    }

    Dog(){
        System.out.println("Object is created");
    }
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
System.out.println(d1);


}
}