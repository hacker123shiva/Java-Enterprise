//we generally create a thread if we want to perform two or more task simultaneously and both task are independent of each other. 
class Multiply implements Runnable{
    public void run(){
        int product=1;
        for(int i=1;i<=10;i++)
        {
product*=i;
System.out.println("Child Thread");
        }
        System.out.println("Product of 10 numbers is: "+product);
        }
    }


public class MainRunnable {
    
    public static void main(String []args){
        Multiply m=new Multiply();
        Thread t=new Thread(m);
        t.start();
        int sum=0;

        for(int i=0;i<10;i++)
        {   sum+=i;
            System.out.println("Main Thread"); 
        }
        System.out.println("Sum of 100 numbers is: "+sum);
        
    }
}

//process based multitasking vs thread based multitasking 
//process based multitasking:
 //process based multitasking is heavy weight process and it is slow and it is not efficient as compared to thread based multitasking
//thread based multitasking:
//thread based multitasking is light weight process and it is fast and it is efficient as compared to process based multitasking

