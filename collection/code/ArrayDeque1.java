import java.util.ArrayDeque;
import java.util.Iterator;

public class ArrayDeque1 {
    public static void main(String []args){
        //internal data structure is doubble ended queue 
        //implement deque interface 
        /*
         *   public java.util.ArrayDeque();
             public java.util.ArrayDeque(int); 
             public java.util.ArrayDeque(java.util.Collection<? extends E>);
         */
        ArrayDeque ad1=new ArrayDeque();
        //default capacity of 16  //time complexity is O(1) 
        /*
         *   static final int inc(int, int);
  static final int dec(int, int);
  static final int inc(int, int, int);
  static final int sub(int, int, int);
         */
        
         /*
          *   public void addFirst(E);
  public void addLast(E);
  public boolean addAll(java.util.Collection<? extends E>);
  public boolean offerFirst(E);
  public boolean offerLast(E);
  public E removeFirst();
  public E removeLast();
  public E pollFirst();
  public E pollLast();
  public E getFirst();
  public E getLast();
  public E peekFirst();
  public E peekLast();
          */

        /*
         *   public boolean removeFirstOccurrence(java.lang.Object);
  public boolean removeLastOccurrence(java.lang.Object);
  public boolean add(E);
  public boolean offer(E);
  public E remove();
  public E poll();
  public E element();
  public E peek();
  public void push(E);
  public E pop();
         */
       
         ad1.add(3);
         ad1.add("shiva");
         ad1.add("muskan");
         ad1.addFirst("harsh");
         ad1.addLast("muskan"); // time complexity is O(1)

         ad1.contains("shiva"); // time complexity is O(n) 
            ad1.size(); // time complexity is O(1)
     
         System.out.println(ad1);

         Iterator itr=ad1.iterator();
         while(itr.hasNext())
         {
            System.out.println(itr.next());
         }

            ad1.removeFirst(); // time complexity is O(1)
            ad1.removeLast(); // time complexity is O(1)
            ad1.pollFirst(); // time complexity is O(1)
            ad1.pollLast(); // time complexity is O(1)
            ad1.getFirst(); // time complexity is O(1)
            ad1.getLast(); // time complexity is O(1)
            ad1.peekFirst(); // time complexity is O(1)
            ad1.peekLast(); // time complexity is O(1)
            ad1.removeFirstOccurrence("shiva"); // time complexity is O(n)
            ad1.removeLastOccurrence("shiva"); // time complexity is O(n)
            // ad1.add(null);  threough null pointer exception 
            System.out.println(ad1);
    }
    
}
