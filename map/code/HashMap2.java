import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
public class HashMap2 {
    public static void main(String []args){
        HashMap hm=new HashMap();
        hm.put(2,"Shiva");
        hm.put(1,"Rama");
        hm.put(3,"Krishna");
        hm.put(4,"Buddha");
        hm.put(5,"Jesus");
        hm.put(6,"Mohammed");
        System.out.println(hm); //hm.toString() is called
        System.out.println(hm.get(2)); // time complexity is O(1)
        System.out.println(hm.get(7));

        System.out.println(hm.containsKey(2)); // time complexity is O(1)
        System.out.println(hm.containsKey(7));

        System.out.println(hm.containsValue("Shiva")); // time complexity is O(n) 
        System.out.println(hm.containsValue("Shiv"));

        System.out.println(hm.remove(2)); // time complexity is O(1) 
        System.out.println(hm.remove(7)); // time complexity is O(1)

        System.out.println(hm); //hm.toString() is called

        System.out.println(hm.size()); // time complexity is O(1)

        System.out.println(hm.isEmpty()); // time complexity is O(1)

        System.out.println(hm.keySet()); // time complexity is O(1)

        System.out.println(hm.values()); // time complexity is O(1)

        System.out.println(hm.entrySet()); // time complexity is O(1)

        System.out.println(hm.hashCode()); // time complexity is O(1)

        System.out.println(hm.equals(hm)); // time complexity is O(1)

        System.out.println(hm.equals(new HashMap())); // time complexity is O(1)

         hm.clear();// time complexity is O(1)

        System.out.println(hm); //hm.toString() is called 
        
        hm.put(2,"Shiva");
        hm.put(1,"Rama");
        hm.put(3,"Krishna");
        hm.put(4,"Buddha");
        hm.put(5,"Jesus");
        hm.put(6,"Mohammed");
        System.out.println(hm); //hm.toString() is called

        Set s=hm.keySet();

        System.out.println(s); //s.toString() is called

        Iterator itr1=s.iterator();

        while(itr1.hasNext()){
            System.out.println( itr1.next());
        }

        Iterator itr2 =hm.values().iterator();
        while(itr2.hasNext()){
            System.out.println(itr2.next());
        }

        Iterator itr3 =hm.entrySet().iterator();
        while(itr3.hasNext()){
            Map.Entry me=(Map.Entry)itr3.next();
            System.out.println(me);
            System.out.println(me.getKey());
            System.out.println(me.getValue());

            if(me.getKey().equals(3)){
                me.setValue("Kanha");
            }
             
            if(me.getKey().equals(4)){
                itr3.remove();  
            }
         
        } 
    
        System.out.println(hm); //hm.toString() is called
    

    }
}
