public class MainSynchronize {
    public static void main(String []args){
        Display d =new Display();
        MyTh1 t1=new MyTh1(d,"Dhoni");
        MyTh1 t2=new MyTh1(d,"Yuvraj");
        t1.start();
        t2.start();
try {
    Thread.sleep(1000);
} catch (InterruptedException e) {
    // TODO Auto-generated catch block
    e.printStackTrace();
}
     synchronized(d){for(int i=0;i<10;i++){
            System.out.println("Main Thread");
        }}

    }
}

class MyTh1 extends Thread{
    Display d;
    String name;
    MyTh1(Display d, String name){
        this.d=d;
        this.name=name;
    }
    public void run(){
         d.wish(name);
        }
    }
class Display{
    public synchronized void wish(String name){
        for(int i=0;i<10;i++){
            System.out.print("Good Morning:");
            try{
                Thread.sleep(100);
            }catch(InterruptedException e){}
            System.out.println(name);
        }
    }
}
