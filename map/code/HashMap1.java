import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
public class HashMap1 
{
    public static void main(String []args){
        HashMap hm=new HashMap();
        hm.put("A","Appple");
        hm.put("B","Ball");
        hm.put("C","Cat");
        hm.put("D","Dog");
        hm.put("E","Elephant");
        hm.put("F",new A());
        System.out.println(hm);
      
        System.out.println();
         
        Set s=hm.keySet();
        System.out.println(s);
        System.out.println(s.getClass().getName());
        
        System.out.println();

        Collection c =hm.values();
        System.out.println(c);
        System.out.println(c.getClass().getName());

        System.out.println();

        Set s1=hm.entrySet();
        System.out.println(s1);
        System.out.println(s1.getClass().getName());

        System.out.println();
        Iterator i=s1.iterator();
        while(i.hasNext()){
    //data of Map.Entry type
            Map.Entry me=(Map.Entry)i.next();
            System.out.println(me.getClass().getName());
            System.out.println(me.getKey()+"="+me.getValue());
        }

        Iterator i1=hm.keySet().iterator();
        while(i1.hasNext()){
            Object key=i1.next();
            System.out.println(i1.getClass().getName());
            Object value=hm.get(key);
            System.out.println(key+"="+value);
        }
        
        System.out.println();

        Iterator i2=hm.values().iterator();
        while(i2.hasNext()){
            Object value=i2.next();
            System.out.println(i2.getClass().getName());
            System.out.println(value);
        }

        //set and get value from key
        Iterator i3 =hm.keySet().iterator();
        while(i.hasNext()){
       Object key=i3.next();
         Object value=hm.get(key);
            System.out.println(key+"="+value);
 
        }

        System.out.println(hm);

    } 
}

// hashmap toString method implementation
// public String toString() {
//     Iterator i = entrySet().iterator();
//     if (! i.hasNext())
//         return "{}";

//     StringBuilder sb = new StringBuilder();
//     sb.append('{');
//     for (;;) {
//         Map.Entry e = (Map.Entry)i.next();
//         Object key = e.getKey();
//         Object value = e.getValue();
//         sb.append(key   == this ? "(this Map)" : key);
//         sb.append('=');
//         sb.append(value == this ? "(this Map)" : value);
//         if (! i.hasNext())
//             return sb.append('}').toString();
//         sb.append(',').append(' ');
//     }
// }



class A{

}