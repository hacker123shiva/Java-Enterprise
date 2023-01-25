 import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
public class ArrayList1 {
  public static void main(String []args){
    java.util.ArrayList<String> al=new java.util.ArrayList<String>();
    ArrayList<Integer> al1=new ArrayList<Integer>();

    al.add("Shiva"); //return boolean
    al.add("Harsh");
    al.add("Arsh");
    al.add("Shiva");
    // al.add(4);  void java.util.ArrayList.add(int index, String element) 
    //The method add(int, String) in the type ArrayList<String> is not applicable for the arguments (int)
    //since, we are adding string type of data in arraylist therefore we can not add integer type of data in arraylist
    al.add(2,"Shivam"); //time complexity is O(n) 
    //al.add(5,"Shivam"); //IndexOutOfBoundsException
    //al.add(-1,"Shivam"); //IndexOutOfBoundsException

    System.out.println(al.contains(4)); //return boolean
    al1.add(4);
    al1.add(5);
    al1.add(6);
    al1.add(7);

    al.equals(al1);
    
    Iterator<String>  itr=al.iterator(); 
    /*
      public Iterator<E> iterator() {
        return new Itr();
    }
     */
  while(itr.hasNext()){
    String s=itr.next();
    System.out.println(s);
  }

ArrayList <Integer> al2=new ArrayList<Integer> ();
al2.add(4);
// al2.add("shiva");
// al2.add(4.5);
// al2.add('a');

Iterator<Integer> itr1=al2.iterator();
while(itr1.hasNext()){
    int s=itr1.next();
    System.out.println(s);
}

System.out.println(al.get(3)); //return string
System.out.println(al.remove(0)); //time complexity is O(n)
System.out.println(al.remove("Shiva")); //return boolean //time complexity is O(n)

System.out.println(al.set(0,"Shivam")); //return string //time complexity is O(n) 

//difference between add(int index, String element) and set(int index, String element) 
//add(int index, String element) add element at particular index and shift all element to right side
//set(int index, String element) replace element at particular index and shift all element to right side 

ArrayList<Number> al3=new ArrayList<Number>();
al3.add(4);
al3.add(4.5);
al3.add(4.5f);
al3.add(4l);
al3.add(4.5d);

ArrayList<Integer> al4=new ArrayList<Integer>();
al4.add(4);
al4.add(5);
al4.add(6);
al4.add(7);

al3.addAll(al4); //time complexity is O(n) 
// al3.addAll(al); //boolean java.util.ArrayList.addAll(Collection<? extends Number> c) //give error because we are adding string type of data in arraylist of integer type of data 

System.out.println(al3);

Object []obj=al3.toArray(); // public <T> T[] toArray(T[]); //return array of string type of data
    
for(Object o:obj){
    System.out.println(o);
}

System.out.println(Arrays.toString(obj)); //return string

// String []str=al3.toArray(new String[]{"shiva","harsh","arsh","shivam"}); //return array of string type of data
// System.out.println(Arrays.toString(str));
// for(String s:str){
    // System.out.println(s);
}
}  
}
