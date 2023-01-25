import java.util.TreeMap;
import java.util.Map;
import java.util.Iterator;

public class TreeMap1 {
    public static void main(String []args)
    {//datastructure is balanced binary search tree 
        TreeMap tm=new TreeMap();
        tm.put(2,"Shiva"); // time complexity is O(log n)
        tm.put(1,"Rama"); 
        tm.put(3,"Krishna");
        tm.put(4,"Buddha");
        tm.put(5,"Jesus");
        tm.put(6,"Mohammed");
        System.out.println(tm.hashCode()); 
        //what is hashcode 
        //hashcode is a unique number for each object  

        System.out.println(tm); //tm.toString() is called

        Iterator itr =tm.entrySet().iterator();
        while(itr.hasNext())
        { System.out.println(itr.hashCode());
            Map.Entry en=(Map.Entry)itr.next();
            System.out.println(en.getKey()+" : "+en.getValue());
            System.out.println(en.getKey().hashCode()+" : "+en.getValue().hashCode()); 
        }
    }
}
