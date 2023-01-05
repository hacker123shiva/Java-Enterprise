 

class CheckOverrideStart extends Thread{
    public void run()  
    {   
        System.out.println(Thread.currentThread().getName());
        for(int i=0;i<10;i++){
            
            System.out.println("Child Thread");
        }
    }

    public void start(){
        System.out.println("Override start method");
        super.start();
    }
}

public class OverrideStart1{
    public static void main(String []args) throws InterruptedException  {
 Thread.currentThread().setName("shiva");
        CheckOverrideStart c=new CheckOverrideStart();
        c.start();
 System.out.println(Thread.currentThread().getName());
        for(int i=0;i<10;i++){
              
            System.out.println("Main Thread");
        }
    }
}

  

