public class Launch1{
   
    public static void main(String[] args){
        new Student("Raj", 1);
        MyThread mt = new MyThread(new Student("Raj", 1));
        new Thread(mt).start();
        // System.gc();
        System.out.println("Hello World!");
    }
}

class MyThread implements Runnable{
    Student s;
    public MyThread(Student s)
    {
        this.s = s;
    }
    public void run(){

 for(int i=0;i<10;i++){
            System.out.println("Child Thread: "+s.name);
          try{  Thread.sleep(5000);}
            catch(InterruptedException e){
                System.out.println("Child Interrupted");
            }
        }
    }
 }

class Student{
    String name;
    int roll;
    public Student(String name, int roll){
        this.name = name;
        this.roll = roll;
    }
    public void finalize(){
        System.out.println("Finalize method called");
    }
}