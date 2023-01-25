public class Student {
    String name;
    Student (String name)
    {System.out.println("constructor is called: "+name);
        this.name=name;
    }
    static Student obj=new Student("SHIVA");
    public static void main(String []args){
        Student s=new Student("aNA");
        System.out.println( s.obj);

    }
public String toString()
{  
    return name;
    
}

}