import java.util.TreeSet;
public class TreeSet1 {
    public static void main(String []args){
        //internal data structure is binary search tree
        //implement sorted set interface 
        /*
         *   public java.util.TreeSet();
            public java.util.TreeSet(java.util.Comparator<? super E>);
            public java.util.TreeSet(java.util.Collection<? extends E>);
            public java.util.TreeSet(java.util.SortedSet<E>);
         */

         //default capacity of Treeset is 16 
         //growing capacity of Treeset is 2*capacity+1


         TreeSet ts1=new TreeSet();
            ts1.add(3);
            ts1.add(2); //adding elements in sorted order time complexity is O(log(n))
            ts1.add(1);
            ts1.add(4);
            ts1.add(5);
            // ts1.add("shiva"); // java.lang.ClassCastException: java.lang.String cannot be cast to java.lang.Integer
            // ts1.add("muskan");
            System.out.println(ts1);
/*
TreeSet follow binary search tree data structure 
3     3      3     3        3
  => /  =>  /  => / \   => / \
    2      2     2   4    2   4
          /     /        /     \
         1     1        1       5 

         Inorder traversal (LVR)
         I/p ---[3,2,1,4,5]
        O/P ---[1,2,3,4,5]

        # searching an element in binary search tree take O(log(n)) time complexity
        # duplicate elements are not allowed in binary search tree
        # binary search tree is sorted
        # binary search tree is not thread safe
        # binary search tree is not synchronized

# Worst case time complexity of add, remove, contains, size is O(n)
# Best case time complexity of add, remove, contains, size is O(1)
# Average case time complexity of add, remove, contains, size is O(log(n))

#but for skewed binary search tree time complexity of add, remove, contains, size is O(n) 
#but for balanced binary search tree time complexity of add, remove, contains, size is O(log(n))

#treeSet worst search time complexity is  O(n)
 */
            ts1.contains(4); // time complexity is O(log(n)) 
            ts1.size(); // time complexity is O(1)

/*
   public E first();
  public E last();
  public E lower(E);
  public E floor(E);
  public E ceiling(E);
  public E higher(E); 
 
 */
 System.out.println(ts1.first()); // time complexity is O(log(n))
 System.out.println(ts1.last()); // time complexity is O(log(n))
    System.out.println(ts1.lower(4)); // time complexity is O(log(n))
    System.out.println(ts1.floor(4)); // time complexity is O(log(n))
    System.out.println(ts1.ceiling(4)); // time complexity is O(log(n))
    System.out.println(ts1.higher(4)); // time complexity is O(log(n))
ts1.add(9);

System.out.println("*************************");
    System.out.println(ts1.lower(7));
    System.out.println(ts1.floor(7));
    System.out.println(ts1.ceiling(7));
    System.out.println(ts1.higher(7));
    
    System.out.println("*************************");
    System.out.println(ts1.lower(9));
    System.out.println(ts1.floor(9));
    System.out.println(ts1.ceiling(10));
    System.out.println(ts1.higher(9));



         
    }
}
