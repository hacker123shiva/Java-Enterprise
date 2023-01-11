class MyJoin extends Thread {
    public void run(){
        for(int i=0;i<10;i++){
            System.out.println("Child Thread");
        }
    }
    }


public class MainJoin {
    public static void main(String [] args)
    {MyJoin t=new MyJoin();
        t.start();
       try{
         t.join(); 
        }

       catch (InterruptedException e) {
           System.out.println(e);
       }

        for(int i=0;i<10;i++)
        {
            System.out.println("Main Thread");
        }
    }
    
}
 