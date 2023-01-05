class CheckOverloadRun extends Thread{
    public void run(){
        for(int i=0;i<10;i++){
            System.out.println("Child Thread");
        }
    }

    public void run(int i){
        for(int j=0;j<10;j++){
            System.out.println("Child Thread overloaded with parameter");
        }
    }
}
  
public class OverloadRun {
    public static void main (String [] args){
        CheckOverloadRun c=new CheckOverloadRun();
        c.run(10);
        for(int i=0;i<10;i++){
            System.out.println("Main Thread");
        }
    }
}


 
