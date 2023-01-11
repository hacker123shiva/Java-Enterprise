class NewThread implements Runnable{
    public void run(){
        try{
           for(int i=0;i<5;i++)
           {
            Thread.sleep(1000);
            System.out.println("Child Thread: "+Thread.currentThread()+" "+i);
           }
        }
        catch(InterruptedException e){
            System.out.println("Child thread Interupted");
        }
    }
}

public class ThreadDemo1 {
    public static void main(String []args){
NewThread r=new NewThread();
Thread t=new Thread(r, "Child1"); //register thread to threadscheduler
t.start();

for(int i=0;i<5;i++)
{
    try{
        Thread.sleep(1000);
        System.out.println("Main thread: "+Thread.currentThread()+" "+i);
    }
    catch(InterruptedException e)
    {
        System.out.println("Main thread interupted");
    }
}
    }
}

 
