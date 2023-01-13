import java.util.HashSet;
public class Hashset1 {
    public static void main(String []args){
        HashSet hs1=new HashSet();
        //default capacity of 16  //time complexity is O(1)
        //index based accessing not allowed in hashset 
        //duplicate elements are not allowed in hashset
        //null insertion is allowed in hashset
        //hashset is not synchronized
        //hashset is not thread safe
        //hashset is not sorted

        hs1.add(3);
        hs1.add(2);
        hs1.add(1);
        hs1.add(4);
        hs1.add(5);
        hs1.add(5);
        hs1.add(null);
        hs1.add(null);
        System.out.println(hs1);
    }
}
