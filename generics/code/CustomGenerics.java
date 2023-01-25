import java.util.ArrayList;
import java.util.Collection;
public class CustomGenerics {
    public static void main(String[]args){
        Student<Integer> s=new Student<Integer>();
        s.show("shiva");
        s.show(4);
        s.show(4.5);
        s.show('a');

        s.help(4);
        // s.help("shiva"); //The method help(Integer) in the type Student<Integer> is not applicable for the arguments (String)
        // s.help(4.5); //The method help(Integer) in the type Student<Integer> is not applicable for the arguments (Double)

        Student <String> s1=new Student<String>();
        Student <Double> s2=new Student<Double>();
        Student <Character> s3=new Student<Character>();
        s.jump(s1);
        s.jump(s2);
        s.jump(s3);

        ArrayList <Object> al=new ArrayList<Object>();
        al.add(4);
        // al.add("shiva");
        // al.add(4.5);
        s.ArrayListshow(al);
        // s.ArrayListshow1(al); //give error because we can not add object type of data in arraylist of number type of data
    
        ArrayList <Number> al1=new ArrayList<Number>();
        
        al1.add(4);
        al1.add(4.5);
        s.ArrayListshow1(al1);
    }
}

class Student<T>{
    public <X> void show(X t){
        System.out.println(t);
    }
   
    public void help(T t){
        System.out.println(t);
    }

    public void jump(Student<?> s){ //? is called wildcard
        System.out.println(s);
    }

    public void ArrayListshow(ArrayList<? super Runnable> al){
        System.out.println(al);
    }

    public void ArrayListshow1(ArrayList<? extends Number> al){
        System.out.println(al);
    }

}