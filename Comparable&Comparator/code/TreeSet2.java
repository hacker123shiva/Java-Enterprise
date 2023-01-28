//sort the string in natural sorting order
import java.util.Comparator;
import java.util.TreeSet;
public class TreeSet2 {
    // public static void main(String []args){
    //     TreeSet t=new TreeSet();
    //     t.add("Shiva");
    //     t.add("Ana");
    //     t.add("Muskan");
    //     t.add("Harsh");
    //     t.add("Arsh");

    //     System.out.println(t);
    // }
/*
 Output:
 PS D:\Java-Enterprise\Comparable&Comparator\code> javac TreeSet2.java
Note: TreeSet2.java uses unchecked or unsafe operations.
Note: Recompile with -Xlint:unchecked for details.
PS D:\Java-Enterprise\Comparable&Comparator\code> java TreeSet2
[Ana, Arsh, Harsh, Muskan, Shiva]
 */
    // public static void main(String[] args){
    //     TreeSet<String> ts=new TreeSet<>();
    //     ts.add("shiva");
    //     ts.add("harsh");
    //     ts.add("arsh");
    //     ts.add("muskan");
    //     ts.add("ana");

    //     System.out.println(ts);

    // }

    /*
PS D:\Java-Enterprise\Comparable&Comparator\code> javac TreeSet2.java
PS D:\Java-Enterprise\Comparable&Comparator\code> java TreeSet2
[ana, arsh, harsh, muskan, shiva]
     */

    //  
 public static void main(String []args){
TreeSet<Integer> ts=new TreeSet<>(new MyComparator());
ts.add(4);
ts.add(5);
ts.add(1);
ts.add(11);
ts.add(12);
ts.add(13);
ts.add(2);
ts.add(1);   
System.out.println(ts);
}
 }
 
     class MyComparator implements Comparator<Integer>{
       
        @Override
        public int compare(Integer o1, Integer o2) {
            if(o1%10==1)
            return 1;
            else if(o1%10==2){
                return -1;
            }
            else{
                return 0;
            }
        }
    }

