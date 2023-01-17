
public class Daemon1 extends Thread 
{ 
    public Daemon1(String name1)
    { 
        super(name1); 
    } 
    public void run() 
    {  
        if(Thread.currentThread().isDaemon()) 
        {  
            System.out.println(getName() + " is Daemon thread");  
        }  
        else
        {  
            System.out.println(getName() + " is User thread");  
        }  
    }  
    public static void main(String[] args) 
    {  
        Daemon1 D1 = new Daemon1("D1"); 
        Daemon1 D2 = new Daemon1("D2"); 
        Daemon1 D3 = new Daemon1("D3"); 

        D1.setDaemon(true);   
        D1.start();  
        D2.start(); 
        D3.setDaemon(true);  
        D3.start();   
        for(int i=0;i<100;i++)
        {
            System.out.println("Main thread");
        }
    }  
}
	