import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.Map;
public class IdentityHashMap1 {
    public static void main(String []args){
        IdentityHashMap ihm=new IdentityHashMap();
        Integer i1=new Integer(150);
        Integer i2=new Integer(150);
        ihm.put( i1,"Shiva");  // time complexity is O(1)
        ihm.put(i2,"Rama"); //here equality check is done by == operator
        ihm.put(150,"Krishna"); 
        ihm.put(150,"Buddha"); 
        ihm.put(1,"Jesus");
        ihm.put(1,"Mohammed"); // since in local buffer  1 is already present so it will represent same object
        System.out.println(ihm);

        System.out.println(ihm.get(i1)); // time complexity is O(1)
        System.out.println(ihm.get(i2)); // time complexity is O(1)
        System.out.println(ihm.get(150)); // time complexity is O(1) // 
        System.out.println(ihm.get(1)); // time complexity is O(1)
        System.out.println(ihm.get(2)); // time complexity is O(1)

        Iterator itr=ihm.entrySet().iterator();
    while(itr.hasNext()){
        Map.Entry en=(Map.Entry)itr.next();
        System.out.println(en.getKey()+" : "+en.getValue());

    }
       
//         IdentityHashMap map = new IdentityHashMap<>();
// map.put("A", 1);
// map.put("B", 2);
// map.put("C", 3);

// Iterator  iterator = map.entrySet().iterator();
// while (iterator.hasNext()) {
//     Map.Entry  entry = (Map.Entry) iterator.next();
//     System.out.println(entry.getKey() + " : " + entry.getValue());
// }

    }
}
