public class MainCLassSync {
    public static void main(String []args){
        Display3 d1 =new Display3();
        Display3 d2 =new Display3();

        MyThe2 t1=new MyThe2(d1,"Dhoni");
        MyThe2 t2=new MyThe2(d1,"Yuvraj");
        t1.start();
        // t2.start();

synchronized(d1){
        for(int i=0;i<10;i++){
            System.out.println("Main Thread1");
            try {
                Thread.sleep(1000);
            } catch ( Exception e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }

 


}
}

class MyThe2 extends Thread{
    Display2 d;
    Display3 d1;
    String name;
    MyThe2(Display2 d, String name){
        this.d=d;
        this.name=name;
    }
    MyThe2(Display3 d, String name){
        this.d1=d;
        this.name=name;
    }
    public void run(){
         d.wish(name);
        }
    }
class Display2{
    public static synchronized void wish(String name){
        for(int i=0;i<10;i++){
            System.out.print("Good Morning:");
            try{
                Thread.sleep(100);
            }catch(InterruptedException e){}
            System.out.println(name);
        }
    }
}

class Display3{
    public void wish1(String name){
      synchronized(this) {for(int i=0;i<10;i++){
            System.out.print("Good Morning:");
            try{
                Thread.sleep(100);
            }catch(InterruptedException e){}
            System.out.println(name);
        }
    }
}
}
 