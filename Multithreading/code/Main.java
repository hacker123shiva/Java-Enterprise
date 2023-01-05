public class Main {
    public static void main(String []args)
    {
        MyThr t=new MyThr();
        t.setPriority(10);
        t.start();
        for(int i=0;i<10;i++){
            System.out.println("Main Thread");
        }
    }
}
class MyThr extends Thread {
    public void run(){
       
        for(int i=0;i<10;i++){
            System.out.println("Child Thread");
        }
    }
}

 