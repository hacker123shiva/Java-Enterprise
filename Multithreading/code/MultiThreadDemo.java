public class MultiThreadDemo {
    public static void main(String ...args){
        NewMultiThread r1=new NewMultiThread("One");
        NewMultiThread r2=new NewMultiThread("two");
        NewMultiThread r3=new NewMultiThread("three");

        for(int i=0;i<5;i++){
           try{ Thread.sleep(500);
            System.out.println("this is main thread: "+i);
           }
           catch(InterruptedException e){
            System.out.println("Main thread interupted");
           }
        }

    }
}

class NewMultiThread implements Runnable{
   
    NewMultiThread(String threadName){
    Thread t=new Thread(this,threadName);
    t.start();
    System.out.println("child: "+t);
    }
    public void run(){
 
        try{
            for(int i=0;i<5;i++)
        {Thread.sleep(500);
System.out.println(Thread.currentThread()+" "+i);
        }      
      }
 catch(InterruptedException e){
    System.out.println("child thread interupted");
 }
}
}

 