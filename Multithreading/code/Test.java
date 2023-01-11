class ThreadB extends Thread{
    int total =0;
     @Override
     public void run(){
     
    synchronized(this){
    System.out.println("Child thread started calculation");
    for (int i=0;i<=100 ; i++){
    total+=i;
    }
    System.out.println("Child thread trying to give notification");
    this.notify();
    }
     }
    }

    class Threadmb extends Thread{
     ThreadB b;
      
     public void run(){
        
        
        System.out.println("Threadmb"+b.total);
// try{
//     Thread.sleep(0,10);
//     System.out.println(b.total);
// }

// catch (InterruptedException e){
//     }
}
}

    public class Test {
    public static void main(String[] args)throws InterruptedException {
    ThreadB b=new ThreadB();
    Threadmb m=new Threadmb();
    m.b=b;
    m.start();
    b.start();
    // Thread.sleep(10000);//10sec
    Thread.sleep(1000);
    synchronized(b){
    System.out.println("Main thread is calling wait on B object");
    b.wait(); 
    System.out.println("Main thread got notification");
    System.out.println(b.total);
    }

     }
    }