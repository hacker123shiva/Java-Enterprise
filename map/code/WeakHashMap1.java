import java.util.WeakHashMap;
public class WeakHashMap1 {
   public static void main(String []args){
WeakHashMap obj=new WeakHashMap();
String s1=new String("shiv");
obj.put(1,s1);
obj.put(s1,5000);
s1=null; //s1 is eligible for gc
Integer i1=Integer.valueOf(4000);
obj.put(i1,10000); //
i1=null; 
obj.put(new String("yuvraj"), 2);
obj.put(new String("Rajiv"), 3);
obj.put(new String("Raj"), 4);
System.out.println(obj);
System.gc();
System.out.println(obj);

   } 
}

