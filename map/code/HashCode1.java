public class HashCode1 {
    public static void main(String []args){
        Student s1=new Student("Shiva");
        Student s2=new Student("Shiva");

        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());

        System.out.println(s1==s2);
        System.out.println(s1.equals(s2)); 
    }
}

class Student {
    String name;
    public Student(String name) {
        this.name = name;
    }

    public int hashCode() { //what is use of hashcode method
            
        return 1;
    }

    public void finalize() {
        System.out.println("finalize method is called object is garbage collected");
    }

    public String toString() {
        return name;
    }

    public boolean equals(Student obj) {
        String name1=obj.toString();
        if(name1.length()!=name.length())
        return false;

        else
        {
            for(int i=0;i<name.length();i++)
            {
                if(name.charAt(i)!=name1.charAt(i))
                return false;
            }
            return true;
        }

        
        
    }
}