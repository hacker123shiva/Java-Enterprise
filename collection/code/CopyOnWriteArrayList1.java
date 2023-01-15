import java.util.concurrent.CopyOnWriteArrayList;

 import java.util.Iterator;

import java.util.ArrayList;
import java.util.ConcurrentModificationException;
public class CopyOnWriteArrayList1 {
    public static void main(String []args)  {
        ArrayList al1=new ArrayList();
        al1.add(2);
        al1.add(4);
        al1.add(1);
        al1.add(5);
        al1.add(9);
        System.out.println(al1);
        try{
            int size=al1.size();
        for(int i=0;i<al1.size();i++){
          
            System.out.println(al1.get(i));
            al1.add(10);

            if(size<al1.size()&&i>=size-1){
                throw new  ConcurrentModificationException();
            }
        }
    }

    catch(  ConcurrentModificationException e){
        System.out.println("ConcurrentModificationException " +"harsh");
    }

    // Iterator itr=al1.iterator();
    // while(itr.hasNext()){
    //     System.out.println(itr.next());
    //     al1.add(10); //fail fast iterator
    // }

        CopyOnWriteArrayList c1=new CopyOnWriteArrayList(al1);
        c1.add(10);
        c1.add(13);
        c1.add(15);
        c1.add(17);

        Iterator itr1=c1.iterator();
        while(itr1.hasNext()){
            System.out.println(itr1.next());
            c1.add(10); //fail safe iterator
        }
    }
}
