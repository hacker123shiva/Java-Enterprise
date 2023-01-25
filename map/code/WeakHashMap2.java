import java.util.WeakHashMap;
public class WeakHashMap2 {
    public static void main(String []args){
Student s1=new Student("Shiva");
Student s2=new Student("Rama");
Student s3=new Student("Krishna");
Student s4=new Student("Buddha");
Student s5=new Student("Jesus");

WeakHashMap whm=new WeakHashMap();
whm.put(s1,1);
whm.put(s2,2);
whm.put(s3,3);
whm.put(s4,4);
whm.put(s5,5);

s1=null;
s2=null;
System.out.println(whm);
System.gc();
try{Thread.sleep(5000);}
catch(Exception e){}
System.out.println(whm);

    }
}

class Student{
String name;
    public Student(String name)
    {
        this.name=name;
    }
public void finalize(){
System.out.println("finalize method is called object is garbage collected");
}

public String toString(){
return name;
}
}