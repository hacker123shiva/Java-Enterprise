class MySleepInterrupt extends Thread {
    public void run() {
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            System.out.println("Interrupted");
        }
    }
}
public class MainInterrupt1 {
    public static void main(String []args){
        MySleepInterrupt m=new MySleepInterrupt();
        m.start();
        m.interrupt();
        System.out.println("End of main");
    }
}

