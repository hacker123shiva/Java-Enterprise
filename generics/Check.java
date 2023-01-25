class Check{
    public static void main(String[] args){
        System.out.println("Hello World");
        Runnable r=new Thread();//can rerrence of interface hold by object of class which implements it or not
        //yes it can hold 

        Object o=r; // upcasting
        //iterable is an interface and it is implemented by collection
 Beta b=new A();
 

    }
}

interface Beta{
public void run();
}

class Alpha{
public void show(){
    System.out.println("In Alpha");
}
}
class A extends Alpha implements Beta{
public void run(){
    System.out.println("In Beta");
}
}

//can interface extends object class or not
//no it can not extends object class because it is already extends by object class
//but how can we call object class method if we using interface reference

