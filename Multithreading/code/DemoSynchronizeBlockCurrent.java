class Display{
    public void wish(String name){
    ;;;;;;;;;;;;; //l-lakh lines of code
    synchronized(Display.class){
    for (int i=1;i<=3;i++ )
    {
    System.out.print("Good night:");
    try{
    Thread.sleep(2000);
    }
    catch (InterruptedException e){}
    System.out.println(name);
    }
    }
     ;;;;;;;;;;;;;//1-lakh lines of code
    }
    }

class MyThread extends Thread{
    Display d;
    String name;
    MyThread(Display d,String name){
    this.d=d;
    this.name=name;
    }
    public void run(){
    d.wish(name);
    }
    }

public class DemoSynchronizeBlockCurrent {
   public static void main(String []args){
  
new MyThread(new Display(),"Muskan").start();;
new MyThread(new Display(),"Ritika").start();
new MyThread(new Display(),"Anshula").start();


   } 
}
 