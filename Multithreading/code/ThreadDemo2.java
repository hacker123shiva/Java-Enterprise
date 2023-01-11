public class ThreadDemo2 {
    public static void main(String ...args){
NewThread2 t=new NewThread2( );
t.start();
try{
    for(int i=0;i<5;i++)
    {
        Thread.sleep(1000);
        System.out.println("Main Thread: "+Thread.currentThread());
    }
}
catch(InterruptedException e){
    System.out.println("main thread interupted");
}
System.out.println("Main Thread task completed");
}
}

class NewThread2 extends Thread{
    NewThread2(){
        super("child1"); //this will call Thread(String threadName);
    }
    public void run(){
        try{
for(int i=0;i<5;i++){
    Thread.sleep(1000);
System.out.println("child Thread: "+Thread.currentThread());
}
        }

        catch(InterruptedException e){
            System.out.println("child thread interupted");
        }

System.out.println("Child Thread Task Completed");
    }
}

 