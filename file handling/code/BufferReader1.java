import java.io.*;
public class BufferReader1 {
    public static void main(String []args) throws IOException{
        FileReader fr=new FileReader("abc.txt");
        BufferedReader br=new BufferedReader(fr);
        String str=br.readLine();
        while(str!=null){
            System.out.println(str);
            str=br.readLine();
        }

    }
}
