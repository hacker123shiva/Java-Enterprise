 
class MyYield1 extends Thread{
    public void run(){
      for(int i=0;i<5;i++){
        System.out.println("Child Thread1");
        Thread.yield();
      }  
    }
}

class MyYield2 extends Thread{
    public void run(){
        for(int i=0;i<5;i++){
            System.out.println("Child Thread2");
        }
    }
}
public class MainYield1 {
 

    public static void main(String[] args) {
        MyYield1 t=new MyYield1(); 
        MyYield2 t1=new MyYield2();


        t.start();
        t1.start();
         
        for(int i=0;i<10;i++){
            
            System.out.println("Main Thread");
        }
    }
}

 