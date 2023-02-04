class Student{
private Integer sid;
private String sname;
private Integer sage;

Student(Integer sid, String sname, Integer sage){
this.sid = sid;
this.sname = sname;
this.sage = sage;
}

public String toString(){
return sid + " " + sname + " " + sage;
}

}

class Test{
public static void main(String[] args){
Student s = new Student(1, "Raj", 23);
System.out.println(s);
}

}