public class DemoJoin {
    public static void main(String ...args){
        Thread.currentThread().setName("Shiva");
        NewThread3 r1=new NewThread3("Anshula");
        NewThread3 r2=new NewThread3("Muskan");
        NewThread3 r3=new NewThread3("Ritika");

        try{
        for(int i=0;i<1;i++){
             
            System.out.println("I am waiting for you "+r1.name+" "+r1.t.isAlive());
            System.out.println("I am waiting for you "+r2.name+" "+r2.t.isAlive());
            System.out.println("I am waiting for you "+r3.name+" "+r3.t.isAlive());
            r1.t.join();
            System.out.println(r1.name+" "+r1.t.isAlive());
            r2.t.join();
            System.out.println(r2.name+" "+r2.t.isAlive());
            r3.t.join();
            System.out.println(r3.name+" "+r3.t.isAlive());

        }
    }

    catch(InterruptedException e){

    }
System.out.println(Thread.currentThread().getName()+" your life wasted due to waiting.");
    }
}

class NewThread3 implements Runnable{
    Thread t;
    String name;
    NewThread3(String threadName){
        this.name=threadName;
   t=new Thread(this, name);
   t.start();
    }
  
    public void run(){
try{
    for(int i=5;i>0;i--){
        System.out.println(name+ ": "+i);
        Thread.sleep(500);
    }
}
catch(InterruptedException e){
    System.out.println("child got interrupted");
}

System.out.println(name+" said donot wait for me.\nYou are only my friend not more than that");
    }

}

 