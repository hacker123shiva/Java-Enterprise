public class Launch2 {
    public static void main(String []args){
        new MyThread1().start();
        try{
            Thread.sleep(4000);
        }
        catch(InterruptedException e){
            System.out.println("main thread interrupted");
        }
    
        System.gc(); //why new MyThread1().start(); is not getting cleared by gc even after 4 seconds of sleep in main thread 
         
        System.out.println("main thread");
    }
}
class MyThread1 extends Thread {
    @Override
    public void finalize(){
System.out.println("object get cleared");
    }
    public void run(){
        new Student();
        for(int i=0;i<10;i++)
        {try{Thread.sleep(1000);}
        catch(InterruptedException e){
            System.out.println("child thread interrupted");
        }
        System.out.println("child thread");
        }
    }
}

class Student{
    public void finalize(){
        System.out.println("object get cleared of student class");
            }
}
 
