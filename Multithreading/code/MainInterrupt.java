public class MainInterrupt {
    public static void main(String [] args){
MyInterrupt t=new MyInterrupt();
MyInterrupt1 t1=new MyInterrupt1();
t1.th=Thread.currentThread();
t.start();
t1.start();
t1.interrupt(); 
for(int i=0;i<100;i++){
    System.out.println("Main Thread");
    }
}

}
class MyInterrupt extends Thread {
    public void run(){
        for(int i=0;i<10;i++){
            System.out.println("Child Thread1");
        }
    }
}

class MyInterrupt1 extends Thread {
    Thread th;
    public void run(){
        // try{
        //     // th.join();
        // }

        // catch(InterruptedException e){
        //     System.out.println(e);
        // }
        for(int i=0;i<10;i++){
            System.out.println("Child Thread2");
           
        }

      
       
    }
}
 
 