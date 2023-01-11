class MyYield extends Thread{
    public void run(){
      for(int i=0;i<5;i++){
        System.out.println("Child Thread");
        Thread.yield();
      }  
    }
}

public class MainYield {
 

    public static void main(String[] args) {
        MyYield t=new MyYield(); 
        t.start();
        // try{
        //     Thread.sleep(1);
        // }
        // catch(InterruptedException e){
        //     System.out.println(e);
        // }
        for(int i=0;i<100;i++){
            
            System.out.println("Main Thread");
        }
    }
}

 