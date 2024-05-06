package collectionFramework;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Treeset {
    public static void main(String[]args){
        //bheind the secene sorted form me cheeze kar rahota hein
       // binary search use hota hein
        Set<Integer>set=new TreeSet<>();
        set.add(32);
        set.add(2);
        set.add(54);
        set.add(21);
        set.add(63);
        System.out.println(set);
        //random element ate han like a bag me kuch saman han
        set.remove(2);
        System.out.println(set);
        System.out.println(set.contains(2) );
        System.out.println(set.size());
        System.out.println(set.isEmpty());

    }
    
}
