import java.util.ArrayList;
public class ArrayList1{
    public static void main(String []args){
        //internally arraylist follow dynamic data structure 
        //arraylist is a class in java.util package 
        ArrayList al1=new ArrayList();
        System.out.println(al1.size());//---- time complexity is O(1)
        System.out.println(al1);
        //Used to check arraylist is empty or not
        System.out.println(al1.isEmpty());//----- time complexity is O(1)
        //used to check 4 is in arraylist al1 or not
        System.out.println(al1.contains(4));//----- time  complexity is O(n) 
        //used to add 4 in arraylist al1
        al1.add(4);
        System.out.println(al1); // here toString() method is called automatically to  print arraylist 
        //al1.toString();
        al1.add("shiva");
        al1.add(4.5);
        al1.add(true);//----capacity is available then O(1) else O(n)
        System.out.println(al1); 
        al1.add(2, "kumar"); //--- time complexity is O(n)
        System.out.println(al1); 
        al1.add(0, "kumar"); //--- time complexity is O(n)
        System.out.println(al1);
        // capacity of arraylist is  10
        // if we add 11th element then capacity will be 10+10/2=15 
        ArrayList al2=new ArrayList(20); // time complexity is O(1)
        System.out.println(al2);
        al2.add(4);
        al2.add("Muskan");
     System.out.println(al1.get(0)); // time complexity is O(1)
        System.out.println(al1.indexOf("kumar")); // time complexity is O(n) //if element is not present then it will return -1
        System.out.println(al1.lastIndexOf("kumar")); // time complexity is O(n) //if element is not present then it will return -1
        System.out.println(al1.remove(0)); // time complexity is O(n) 
        System.out.println(al1);
al1.addAll(al2); // time complexity is O(n)
        System.out.println(al1);
        al1.addAll(2, al2); // time complexity is O(n)
        System.out.println(al1);
        System.out.println(al1.set(2, "kumar")); // time complexity is O(1) //it will return old value 
        System.out.println(al1);
        System.out.println(al1.subList(2, 4)); // time complexity is O(n)
        System.out.println(al1);
        System.out.println(al1.size()); // time complexity is O(1)
        al1.clear(); // time complexity is O(1)
        System.out.println(al1);
        System.out.println(al1.isEmpty()); // time complexity is O(1) 
        //work on homogenous data structure and heterogenous data structure 
        //Stored as object  
         
        

        

    }
}