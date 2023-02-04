import java.io.File;
import java.io.IOException;
public class File2 {
    public static void main(String []args){
        String fileName ="abc.txt";
        //this line check whetehe the file caalled "abc.txt" exists or not not 
        //if it is available then it wiell point to that file
        //otherwise it will create file object 
        File f = new File(fileName);
        //if file exists 
        System.out.println(f.exists());
        try {
            f.createNewFile();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        System.out.println(f.exists());
        
    }
}
