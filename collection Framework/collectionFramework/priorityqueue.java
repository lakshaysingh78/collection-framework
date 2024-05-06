package collectionFramework;
import java.util.*;

public class priorityqueue {
    public static void main(String[]args){
        PriorityQueue<Integer>pq=new PriorityQueue<>(Comparator.reverseOrder());
        pq.offer(40);
        pq.offer(12);
        pq.offer(24);
        pq.offer(36);
        System.out.println(pq);
        //min heap implement hori han
        pq.poll();
        System.out.println(pq);
        System.out.println(pq.peek());
    }

    
}
