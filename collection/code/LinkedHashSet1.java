import java.util.LinkedHashSet;
public class LinkedHashSet1 {
    public static void main(String []args){
        LinkedHashSet lhs1=new LinkedHashSet();
        //default capacity of 16  //time complexity is O(1)
       //insertion order is preserved 
       //linkedhashset implement set interface and linkedhashset is child class of hashset
       //linkedhashset use data structure is hashtable and linkedlist 
    lhs1.add(4);
    lhs1.add(3);
    lhs1.add(2);
    lhs1.add(1);
    lhs1.add(5);
    lhs1.add(5); //time complexity is O(1)
    lhs1.add(null);
    lhs1.add(null);
    System.out.println(lhs1);
 
    }
}
