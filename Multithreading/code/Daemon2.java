class MyThread extends Thread{}
 class Test {

public static void main(String[] args){
System.out.println(Thread.currentThread().isDaemon());//false
Thread.currentThread().setDaemon(true);//RE:IllegalThreadStartException
MyThread t=new MyThread();
System.out.println(t.isDaemon());//false
t.setDaemon(true);
t.start();
System.out.println(t.isDaemon());//true

}
}