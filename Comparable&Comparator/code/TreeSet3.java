import java.util.TreeSet;
public class TreeSet3 {
    public  static void main(String []args){
       Student s1=new  Student("shiva",23,22,2002);
       Student s2=new  Student("muskan",17,20,2002);
       Student s3=new  Student("ananya",2,20,2002);
       Student s4=new  Student("shiva",23,20,2002);

       TreeSet<Student> ts=new TreeSet<>();
       ts.add(s1);
       ts.add(s2);
       ts.add(s3);
       ts.add(s4);

       System.out.println(ts);
    }
}

class Student  implements Comparable<Student>{
int rollNo;
int age;
int year;
String name;

 Student(String name, int rollNo, int year, int age){
    this.name=name;
    this.age=age;
    this.rollNo=rollNo;
    this.year=year;
 }

 @Override
 public String toString(){
return "Student name is "+name+" whose age is "+age+".";
 }

 @Override
 public boolean equals(Object obj){
    Student st=(Student)obj;
    if(this.rollNo==st.rollNo)
    return true;

    else 
    return false;
 }

 public int compareTo(Student obj){
    if(this.name.compareTo(obj.name)<0)
    {
        return 1;
    }

    else 

    return -1;

    
 }


}