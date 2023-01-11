class CallMe{
    public static synchronized void call(String str){
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

class Caller implements Runnable{
String str;
CallMe target;
Thread t;
    public Caller(String str ,CallMe target ){
       this.str=str;
       this.target=target;
       t=new Thread(this);
    }

    public void run(){
target.call(str);
    }
}

public class DemoSynchronization {
    public static void main(String []args){
 
Caller ob1=new Caller("Shiva Srivastava",new CallMe());
Caller ob2=new Caller("Muskan Garg",new CallMe());
Caller ob3=new Caller("Ritika Singh",new CallMe());

System.out.println("With Syncronization");
ob1.t.start();
ob2.t.start();
ob3.t.start();
    }
}

 