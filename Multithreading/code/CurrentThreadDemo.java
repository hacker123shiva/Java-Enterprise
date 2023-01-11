public class CurrentThreadDemo{
    public static void main(String ...args){
        //controlling the main thread    
        Thread t=Thread.currentThread(); 
        System.out.println("Current Thread : "+t);

        //change the name of the thread
        t.setName("My Main Thread");
        System.out.println("After name change: "+t);
        try{
            for(int n=5;n>0;n--)
            {
                System.out.println(n);
                Thread.sleep(1000);
            }
        }

        catch(InterruptedException e){
            System.out.println("Main Thread Interputed");  
        }
    }
}

 