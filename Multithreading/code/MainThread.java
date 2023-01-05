class MyThread extends Thread{
    //override run() method
    public void run(){
        for(int i=0;i<10;i++)
        {
            System.out.println("Child Thread");
        }
    }
}

public class MainThread{
public static void main(String[] args) throws InterruptedException{
MyThread t=new MyThread();
t.start();
Thread.sleep(4000);
for(int i=0;i<10;i++)
{ 
    System.out.println("Main Thread");
}
}
}