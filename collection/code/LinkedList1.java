import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Spliterator;
public  class LinkedList1 {
    public static void main(String ...args){
        //linkedlist is a class in java.util package 
        //internally linkedlist follow doubly linked data structure
        LinkedList ll1=new LinkedList();
        System.out.println(ll1.size());//---- time complexity is O(1)
        System.out.println(ll1);
        //Used to check linkedlist is empty or not
        System.out.println(ll1.isEmpty());//----- time complexity is O(1)
        //used to check 4 is in linkedlist ll1 or not
        System.out.println(ll1.contains(4));//----- time  complexity is O(n)
        //used to add 4 in linkedlist ll1
        ll1.add(4);
        System.out.println(ll1); // here toString() method is called automatically to  print linkedlist
        //ll1.toString();

        ll1.add("shiva");
        ll1.add(4.5);
        ll1.add(true);//----capacity is available then O(1) else O(n)
        System.out.println(ll1);
        ll1.add(2, "kumar"); // time complexity is O(1) because it is doubly linked data structure
        System.out.println(ll1);
        ll1.add(0, "kumar"); // time complexity is O(1) because it is doubly linked data structure
        System.out.println(ll1);
        //linked list does not have capacity because  it is not contigous memory allocation 
        LinkedList ll2=new LinkedList(); // time complexity is O(1) 
        System.out.println(ll2);
        ll2.add(4);
        ll2.add("Muskan");
        System.out.println(ll1.get(0)); // time complexity is O(1)
        System.out.println(ll1.indexOf("kumar")); // time complexity is O(n) //if element is not present then it will return -1  
        System.out.println(ll1.lastIndexOf("kumar")); // time complexity is O(n) //if element is not present then it will return -1
        System.out.println(ll1);
        System.out.println(ll1.remove(0)); // time complexity is O(1)  //return the element which removed from linkedlist
        System.out.println(ll1);
        System.out.println(ll1.remove("kumar")); // time complexity is O(n) //return the element which removed from linkedlist
        System.out.println(ll1);
       // remove is overloaded method  
      //    public boolean remove(java.lang.Object);
     // public E remove();

     /*
      *   public E getFirst();
  public E getLast();
  public E removeFirst();
  public E removeLast();
  public void addFirst(E);
  public void addLast(E);
      */

System.out.println(ll1.getLast()); // time complexity is O(1)
System.out.println(ll1.getFirst()); // time complexity is O(1)
System.out.println(ll1.removeFirst()); // time complexity is O(1)
System.out.println(ll1.removeLast()); // time complexity is O(1)
System.out.println(ll1);
ll1.addFirst("muskan");// time complexity is O(1)
ll1.addLast("gla"); // time complexity is O(1)
System.out.println(ll1); // time complexity is O(1)

/*
 *public boolean contains(java.lang.Object);
  public int size();
  public boolean add(E);
  public boolean remove(java.lang.Object);
  public boolean addAll(java.util.Collection<? extends E>);
  public boolean addAll(int, java.util.Collection<? extends E>);
 */
System.out.println(ll1.contains("muskan")); // time complexity is O(n)
System.out.println(ll1.size());// time complexity is O(1)
System.out.println(ll1.add("shiva"));// time complexity is O(1)
System.out.println(ll1);
System.out.println(ll1.remove("shiva"));// time complexity is O(n)
System.out.println(ll1);
System.out.println(ll1.addAll(ll2));// time complexity is O(1) because it is not contigous memory allocation
System.out.println(ll1);
System.out.println(ll1.addAll(2, ll2));// time complexity is O(1) 
System.out.println(ll1);


/*
 *  
  public E get(int);
  public E set(int, E);
  public void add(int, E);
  public E remove(int);
  public void clear();
 */

 System.out.println(ll1.get(2)); // time complexity is O(1)
 System.out.println(ll1.set(1, "shiva")); // time complexity is O(1) //return the element which replaced
 System.out.println(ll1);
 ll1.add(2,"harsh") ;// time complexity is O(1)
System.out.print(ll1);
System.out.println(ll1.remove(2)); // time complexity is O(1) //return the element which removed from linkedlist
System.out.println(ll1);
// ll1.clear(); // time complexity is O(1)
System.out.println(ll1);

/*
 *public int indexOf(java.lang.Object);
  public int lastIndexOf(java.lang.Object);
  public E peek();
  public E element();
  public E poll();
  public E remove();
 */

 System.out.println(ll1.indexOf("shiva")); // time complexity is O(n) //if element is not present then it will return -1 
System.out.println(ll1.lastIndexOf("shiva")); // time complexity is O(n) //if element is not present then it will return -1
System.out.println(ll1.peek()); // time complexity is O(1) //return the element which is present at first position 
System.out.println(ll1);
System.out.println(ll1.element()); // time complexity is O(1) //return the element which is present at first position
System.out.println(ll1);
//difference between peek() and element() is that if linkedlist is empty then peek() will return null and element() will throw exception
System.out.println(ll1.poll()); // time complexity is O(1) //return the element which is present at first position and remove it from linkedlist
System.out.println(ll1);
System.out.println(ll1.remove()); // time complexity is O(1) //return the element which is present at first position and remove it from linkedlist
System.out.println(ll1);

/*
 *public boolean offer(E);
  public boolean offerFirst(E);
  public boolean offerLast(E);
  public E peekFirst();
  public E peekLast();
  public E pollFirst();
  public E pollLast();
 */

System.out.println(ll1.offer("shiva")); // time complexity is O(1) //return true if element is added otherwise false //used to add element at last position 
System.out.println(ll1);
System.out.println(ll1.offerFirst("shiva")); // time complexity is O(1) //return true if element is added otherwise false //used to add element at first position
System.out.println(ll1);
System.out.println(ll1.offerLast("muskan")); // time complexity is O(1) //return true if element is added otherwise false //used to add element at last position
System.out.println(ll1);
System.out.println(ll1.peekFirst()); // time complexity is O(1) //return the element which is present at first position 
System.out.println(ll1);
System.out.println(ll1.peekLast()); // time complexity is O(1) //return the element which is present at last position
System.out.println(ll1);
System.out.println(ll1.pollFirst()); // time complexity is O(1) //return the element which is present at first position and remove it from linkedlist
System.out.println(ll1);
System.out.println(ll1.pollLast()); // time complexity is O(1) //return the element which is present at last position and remove it from linkedlist
System.out.println(ll1);
//differnce between poll() and remove() is that if linkedlist is empty then poll() will return null and remove() will throw exception

/*
 *public void push(E);
  public E pop();
  public boolean removeFirstOccurrence(java.lang.Object);
  public boolean removeLastOccurrence(java.lang.Object);
 */
ll1.push("arsh"); // time complexity is O(1) //used to add element at first position
System.out.println(ll1);
System.out.println(ll1.pop()); // time complexity is O(1) //return the element which is present at first position and remove it from linkedlist 
System.out.println(ll1);
System.out.println(ll1.removeFirstOccurrence("shiva")); // time complexity is O(n) //return true if element is removed otherwise false 
System.out.println(ll1);
System.out.println(ll1.removeLastOccurrence("shiva")); // time complexity is O(n) //return true if element is removed otherwise false 
System.out.println(ll1);

/*
 *  public java.util.ListIterator<E> listIterator(int);
  public java.util.Iterator<E> descendingIterator();
  public java.lang.Object clone();
  public java.lang.Object[] toArray();
  public <T> T[] toArray(T[]);
  public java.util.Spliterator<E> spliterator();
}
 */
// iterator 
Iterator itr = ll1.iterator();
while(itr.hasNext())
{
    System.out.println(itr.next());

}

// list iterator
ListIterator litr = ll1.listIterator();
while(litr.hasNext())
{
    System.out.println(litr.next());

}
ListIterator litr1 = ll1.listIterator(ll1.size());
while(litr1.hasPrevious())
{
    System.out.println(litr1.previous());

}

// descending iterator use to print linkedlist in reverse order  
Iterator itr1 = ll1.descendingIterator();
while(itr1.hasNext())
{
    System.out.println(itr1.next());

}

// clone method use to create a copy of linkedlist 
LinkedList ll3 = (LinkedList)ll1.clone();
System.out.println(ll3);

// toArray method use to convert linkedlist into array 
Object[] arr = ll1.toArray();
for(Object o : arr)
{
    System.out.println(o);

}

System.out.println("spliterator method");
//spliterator method use to split linkedlist into two parts 
Spliterator spl = ll1.spliterator();
spl.forEachRemaining(System.out::println);






    }
}
