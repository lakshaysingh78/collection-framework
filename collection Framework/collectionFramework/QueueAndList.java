package collectionFramework;
import java.util.*;
public class QueueAndList {
    public static void main(String[]args){
        Queue<Integer>queue=new LinkedList<>();
        //queue.offer() help to insert ethe element
        queue.offer(12);
        queue.offer(24);
        queue.offer(36);
        queue.offer(48);
        queue.offer(50);
        System.out.println(queue);
        //poll ye element ko remove or usko return bhi krdeta han
        System.out.println(queue.poll());
        System.out.println(queue);
        //konsa wala element han next bhar nikal ne ke liye bta dega

        System.out.println(queue.peek());
        System.out.println(queue);
    }
    
}
