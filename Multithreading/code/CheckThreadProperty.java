class Check extends Thread{
    public void run(){
        for(int i=0;i<10;i++){
            System.out.println("Check it is Child thread or not");
        }
    }

}
public class CheckThreadProperty{
    public static void main(String []args){
        Check c =new Check();
        c.run();
        for(int i=0;i<10;i++){
            System.out.println("Main Thread");
        }
        }
    }

 