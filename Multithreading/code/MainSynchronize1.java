public class MainSynchronize1 {
    public static void main(String []args){
        Display1 d =new Display1();
        MyTh2 t1=new MyTh2(d,"Dhoni");
        MyTh3 t2=new MyTh3(d,"Yuvraj");
        MyTh4 t3=new MyTh4(d,"Kohli");
        t1.start();
        // t2.start();
        // t3.start();
 
     synchronized(d){for(int i=0;i<10;i++){
            System.out.println("Main Thread");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }}

    }
}

class MyTh2 extends Thread{
    Display1 d;
    String name;
    MyTh2(Display1 d, String name){
        this.d=d;
        this.name=name;
    }
    public void run(){
         d.wish(name);
        }
    }
class MyTh3 extends Thread{
    Display1 d;
    String name;
    MyTh3(Display1 d, String name){
        this.d=d;
        this.name=name;
    }
    public void run(){
         Display1.wish1(name);
        }
    }

class MyTh4 extends Thread{
    Display1 d;
    String name;
    MyTh4(Display1 d, String name){
        this.d=d;
        this.name=name;
    }
    public void run(){
         d.wish2(name);
        }
    }


class Display1{
    public synchronized void wish(String name){
        for(int i=0;i<10;i++){
            System.out.print("Good Morning:");
            try{
                Thread.sleep(100);
            }catch(InterruptedException e){}
            System.out.println(name);
        }
    }

    public static synchronized void wish1(String name){
       
        for(int i=0;i<10;i++){
            System.out.print("Good Evening:");
            try{
                Thread.sleep(100);
            }catch(InterruptedException e){}
            System.out.println(name);
      
    }

    }

    public void wish2(String name){
        for(int i=0;i<10;i++){
            System.out.print("Good Night:");
            try{
                Thread.sleep(100);
            }catch(InterruptedException e){}
            System.out.println(name);
        }
    }
    }

