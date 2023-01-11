
class MySleep extends Thread{
    public void run(){
        for(int i=0;i<10;i++){
            System.out.println("Child Thread");
        }
    }
}
public class MainSleep {
    public static void main(String []args){
        MySleep m=new MySleep();
        m.start();
for(int i=0;i<10;i++){
   
    System.out.println("Main Thread");
    try{Thread.sleep(1000);
    }
    catch(InterruptedException e){
        System.out.println(e);
}
    }
}
}

 