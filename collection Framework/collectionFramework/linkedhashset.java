package collectionFramework;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class linkedhashset {
    public static void main(String[]args){
        //in the set the duplictae elements are not allowed
        Set<Integer>set=new LinkedHashSet<>();
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
