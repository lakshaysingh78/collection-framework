//agay or ppeeche se bhi element dal skte han or dono side se  peek kr skte han

package collectionFramework;
import java.util.*;
public class arraydeque {
    public static void main(String[]args){
    ArrayDeque<Integer>adq=new ArrayDeque<>();
    adq.offer(23);
    adq.offerFirst(12);
    adq.offerLast(45);
    adq.offer(26);
    System.out.println(adq);
    System.out.println(adq.peek());
    System.out.println(adq.peekFirst());
    System.out.println(adq.peekLast());
System.out.println(adq.poll());
System.out.println("pol()" + adq);
System.out.println(adq.pollFirst());
System.out.println("pol()" + adq);
System.out.println(adq.pollLast());
System.out.println("pol()" + adq);
    }
}
