class MyThread extends Thread{
    public void run(){
    for (int i=1;i<=10 ;i++ ){
    System.out.println("child thread");
    try{
    Thread.sleep(2000);//2sec
    }
    catch (InterruptedException e){
    System.out.println(e);
    }
    }
    }
    }
    class Test {
    public static void main(String[] args){
    MyThread t=new MyThread();
    t.setDaemon(true);//stmt-1
    t.start();
    System.out.println("end of main thread");
    
    }
    }
