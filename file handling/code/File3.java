import java.io.File;
import java.io.IOException;
public class File3 {
    public static void main(String []args){
        File f1=new File("D://Java-Enterprise//file handling//typed-notes");
        f1.mkdir();
        File f=new File("D://Java-Enterprise//file handling//typed-notes","typed-notes");
        System.out.println(f.exists());
    
        try {
        f.createNewFile();
    } catch (IOException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
    }

    }
    
}
