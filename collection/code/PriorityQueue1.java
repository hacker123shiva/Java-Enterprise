import java.util.PriorityQueue;

public class PriorityQueue1 {
    public static void main(String []args){
        //# intrnal data structure is min heap
        //# implement queue interface 
        //# default capacity of priority queue is 11
        //# growth factor is 1.5 
        //# time complexity is O(log(n))
        /*
  public java.util.PriorityQueue();
  public java.util.PriorityQueue(int);
  public java.util.PriorityQueue(java.util.Comparator<? super E>);
  public java.util.PriorityQueue(int, java.util.Comparator<? super E>);
  public java.util.PriorityQueue(java.util.Collection<? extends E>);
  public java.util.PriorityQueue(java.util.PriorityQueue<? extends E>);
  public java.util.PriorityQueue(java.util.SortedSet<? extends E>);
         */
 
         PriorityQueue pq1=new PriorityQueue();
            pq1.add(3); // time complexity is O(log(n))  
            pq1.add(2);
            pq1.add(1);
            pq1.add(4);
            pq1.add(5);
            // pq1.add("shiva"); // java.lang.ClassCastException: java.lang.String cannot be cast to java.lang.Integer 
            // pq1.add("muskan");
            System.out.println(pq1);
        
            /*
            Min heap data structure i/p 3, 2, 1, 4, 5
             3      2     2     1            1            1    ---1 is the root node
            /   => /  => / \ =>/ \     =>   / \      =>  / \ 
           2      3     3   1 3   2        3   2        3   2  ---3, 2 are the child nodes
                                          /            / \ 
                                         4            4   5    ---4,5 are the child nodes

            # traverse the min heap in level order 
            1, 2, 3, 4, 5
             */ 
            
             //# searching an element in min heap take O(n) time complexity
            System.out.println(pq1.contains(2)); // time complexity is O(n)
                pq1.size(); // time complexity is O(1)
            pq1.add(2);
            pq1.add(1);

            /*
            Min heap data structure i/p 3, 2, 1, 4, 5, 2, 1
             3      2     2     1            1            1           1          1            1     ---0 th level
            /   => /  => / \ =>/ \     =>   / \      =>  / \    =>  /   \  =>  /   \  =>    /   \
           2      3     3   1 3   2        3   2        3   2      3     2    3     2      3     1  --- 1 st level
                                          /            / \        / \   /    / \   / \    / \   / \ 
                                         4            4   5      4   5 2    4   5 2   1  4   5 2   2     --- 2nd level

                     level order traversal 
                o/P ---   [1, 3, 1, 4, 5, 2, 2]            
                                            
             */
            System.out.println(pq1);
          //# duplicate elements are allowed in min heap 
          //# min heap is not sorted 
          //# min heap is not thread safe
          //# min heap is not synchronized
          //# index based access is not allowed in min heap
          
        //   pq1.add(4.5);  // java.lang.ClassCastException: java.lang.Double cannot be cast to java.lang.Integer
        //   pq1.add(4.5f); // java.lang.ClassCastException: java.lang.Float cannot be cast to java.lang.Integer
        //   pq1.add(4.5d); // java.lang.ClassCastException: java.lang.Double cannot be cast to java.lang.Integer
        // pq1.add(4l);  // java.lang.ClassCastException: java.lang.Long cannot be cast to java.lang.Integer
        // pq1.add('c');  // java.lang.ClassCastException: java.lang.Character cannot be cast to java.lang.Integer

        //only Integer type object is allowed in priority queue
        // pq1.add(null);  // java.lang.NullPointerException


         


    }
}
