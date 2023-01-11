

public class MainJoin2 {
     public static void main(String [] args){
        MyJoin2 th1=new MyJoin2();
        MyJoin3 th2=new MyJoin3();
        th1.t1=Thread.currentThread();
        th1.t2=th2;
        th2.tt1=Thread.currentThread();
         
        th1.start();
        th2.start();
        
        
        for(int i=0;i<10;i++){
            System.out.println("Main thread");
        }

     }
}

class MyJoin2 extends Thread {
    Thread t1;
    Thread t2;

public void run(){   
     try{t1.join();
     t2.join();
     }
        catch (InterruptedException e) {
            System.out.println(e);
        }
    for(int i=0;i<10;i++){
        System.out.println("Child thread1");
    }
}
}

class  MyJoin3 extends Thread{
    Thread tt1;
    public void run(){
          try{tt1.join();
          }

        catch (InterruptedException e) {
            System.out.println(e);
        }

        for(int i=0;i<10;i++){
            System.out.println("Child thread2");
        }
    }
}


 
 