class CallMe1{
    public  void call(String str){
        try{
            System.out.print("["+str);
            Thread.sleep(1000);
        }
        catch(InterruptedException e){
            System.out.println("Interrupted");
        }
        System.out.println("]");
    }
}

class Caller1 implements Runnable{
String str;
CallMe1 target;
Thread t;
    public Caller1(String str ,CallMe1 target ){
       this.str=str;
       this.target=target;
       t=new Thread(this);
    }

    public void run(){
        synchronized(target){
target.call(str);
        }
    }
}
public class DemoSynchronizedBlock {
    public static void main(String []args){
CallMe1 target= new CallMe1();
Caller1 ob1=new Caller1("Shiva",target);
Caller1 ob2=new Caller1("Muskan",target);
Caller1 ob3=new Caller1("Ritika",target);

System.out.println("Synchronized statement");
ob1.t.start();
ob2.t.start();
ob3.t.start();
    }
}

