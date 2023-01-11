// public class Main {
//     public static void main(String []args)
//     {Disp d=new Disp();
//         MyThr11 t1=new MyThr11(d,"Dhoni");
//         MyThr22 t2=new MyThr22(d,"Yuvraj");

//         t1.start();
//         t2.start();
// synchronized(d){for(int i=0;i<100;i++){
//             System.out.println("Main Thread");
//         }}

//     }
// }
// class MyThr11 extends Thread {
//     Disp d;
//     String name; 
//     MyThr11(Disp d, String name){
//         this.d=d;
//         this.name=name;
//     } 

//     public void run(){
//     synchronized(d){
//         for(int i=0;i<100;i++)
//         System.out.println("shiva"); }
//     }

// }

// class MyThr22 extends Thread {
//     Disp d;
//     String name; 
//     MyThr22(Disp d, String name){
//         this.d=d;
//         this.name=name;
//     } 

//     public void run(){
//     synchronized(d){d.wish(name); }
//     }



// }

// class Disp {
//     public void wish(String name){
       
//       for(int i=0;i<50;i++){
//             System.out.print("Good Morning:");
//             // try{
//             //     Thread.sleep(100);
//             // }catch(InterruptedException e){}
//             System.out.println(name);
//         }
//     }
 

//     }

 
 public class Main{
    public static void main(String []args){
MyThr1 t1= new MyThr1("Ritika","shiva","gla");
MyThr1 t2= new MyThr1("Anshula","harsh","rk");
t1.start();
t2.start();
    }
 }
 
 class MyThr1 extends Thread{
    String name;
    String name1;
    String name2;
 MyThr1(String name, String name1, String name2){
        this.name=name;
        this.name1=name1;
        this.name2=name2;
    }
    
    public void run(){
       for(int i=0;i<10;i++){
           System.out.println(name1);
       }

       synchronized(MyThr1.class){
           for(int i=0;i<10;i++){
            try{Thread.sleep(2000);}
            catch(InterruptedException e){}
               System.out.println( name);
           }
       }

       for(int i=0;i<5;i++){
              System.out.println(name2);
       }
    }
 }