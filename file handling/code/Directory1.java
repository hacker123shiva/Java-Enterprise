import java.io.File;
import java.io.IOException;

class Main{
    public static void main(String[] args){
 File f=new File("Typed-Notes");
 f.mkdir();
    File f1=new File("Typed-Notes","abc.txt");
    try{
        f1.createNewFile();
    }catch(Exception e){
        System.out.println(e);
    }

    System.out.println(f1.isDirectory());
    System.out.println(f1.isFile());

    String location="D://Java-Enterprise//file handling//Typed-Notes";
    File f2=new File(location,"abc.txt");
    try {
        f2.createNewFile();
    } catch (IOException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
    }
    System.out.println(f2.exists());

 
    


    }
}
/*
 File f=new File("iNeuron");
 f.mkdir();
 File f1=new File("iNeuron","abc.txt");
 f1.createNewFile();

// isDirectory() is used to check whether the file is a directory or not
// isFile() is used to check whether the file is a file or not


 */