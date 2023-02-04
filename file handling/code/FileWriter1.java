import java.io.FileWriter;
import java.io.IOException;

/*
   public java.io.FileWriter(java.lang.String) throws java.io.IOException;
  public java.io.FileWriter(java.lang.String, boolean) throws java.io.IOException;
  public java.io.FileWriter(java.io.File) throws java.io.IOException;
  public java.io.FileWriter(java.io.File, boolean) throws java.io.IOException;
 */
 class  Main {

 public static void main(String []args){
    try{//true is used to append the content in current file
        FileWriter f1=new FileWriter("abc.txt",true );
        f1.write(45);
        f1.write("sha");
        f1.write('o');
        f1.write('\n');
        f1.write(new char[]{'a','b','c'});
        f1.flush();
    }
        catch(IOException e){
            e.printStackTrace();
        }
    
 }
    
}
