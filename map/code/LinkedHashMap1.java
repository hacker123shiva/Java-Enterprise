import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Iterator; 
 
public class LinkedHashMap1 {
    public static void main(String []args){
        LinkedHashMap lhm=new LinkedHashMap();
        lhm.put(2,"Shiva");
        lhm.put(1,"Rama");
        lhm.put(3,"Krishna");
        lhm.put(4,"Buddha");

        Iterator itr=lhm.entrySet().iterator();
        while(itr.hasNext()){
            Map.Entry en=(Map.Entry)itr.next();
            System.out.println(en.getKey()+" : "+en.getValue());
        }

    }
}
