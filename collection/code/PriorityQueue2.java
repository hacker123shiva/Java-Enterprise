import java.util.PriorityQueue;

public class PriorityQueue2 {
    public static void main(String []args){
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        pq.add(12);
        pq.add(7);
        pq.add(11);
        pq.add(1);
        pq.add(8);
        pq.add(6);
        pq.add(5);
        pq.add(10);
        pq.add(10);

        System.out.println(pq);
    }
}
