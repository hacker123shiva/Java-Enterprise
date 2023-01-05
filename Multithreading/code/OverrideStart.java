class CheckOverride extends Thread{
    public void run(){
        for(int i=0;i<10;i++){
            System.out.println("Child Thread");
        }
    }

    public void start(){
        System.out.println("Override start method");
         run();
             
       
    }
}

public class OverrideStart {
    public static void main(String []args){
        CheckOverride c=new CheckOverride();
        c.start();
        for(int i=0;i<10;i++){
            System.out.println("Main Thread");
        }
    }
}

