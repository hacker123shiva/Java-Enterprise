

public class Annotation1 {
    
}

@FunctionalInterface
interface i1
{
    void m1();
    // void m2(); //give error since it is functional interface
}

class A{
    public void m1(){
        System.out.println("A");
    }
}

class B extends A{
    @Override
    public void m1(){
        System.out.println("B");
    }
}

//anotation is type of comment which is used to provide meta data to the compiler and JVM about the program
//differnce between annotation and comment
//1)annotation is used to provide meta data to the compiler and JVM about the program but comment is used to provide information to the programmer 
