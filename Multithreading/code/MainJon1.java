class MyJoin1 extends Thread {
    Thread mainThread;
    public void run(){
        try{
        mainThread.join();
        }
        catch (InterruptedException e) {
            System.out.println(e);
        }
        for(int i=0;i<10;i++){
            System.out.println("Child Thread");
        }
    }
}


public class MainJon1 {
    public static void main(String [] args)
    {MyJoin1 t=new MyJoin1();
        t.start();
       
        t.mainThread=Thread.currentThread();

        for(int i=0;i<10;i++)
        {
            System.out.println("Main Thread");
        }
    }
    
}
 
 