 

public class DemoProducerConsumerWrong{
    public static void main(String []args){
    Q q=new Q();
    Producer p=new Producer(q);
    Consumer c=new Consumer(q);
    p.t.start();
     c.t.start();
    }
}

class Q{
    private int n=0;
    public synchronized int get (){
        System.out.println("Got: "+n);
        return n;
    }
    public synchronized void put(int n){
        this.n=n;
        System.out.println("Put: "+n);
    }
}

class Producer implements Runnable{
    Q q;
    Thread t;
    public Producer(Q q){
        this.q=q;
        t=new Thread(this,"Producer");
    }
    public void run(){
        int i=0;
        while(true){
            if(i==2000)
            break;
            q.put(i++);
            
        }
    }
}

class Consumer implements Runnable{
    Q q;
    Thread t;
    public Consumer(Q q){
        this.q=q;
        t=new Thread(this,"Consumer");
    }
    public void run(){
        while(true){
            q.get();
        }
    }
}
 