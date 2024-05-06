package collectionFramework;

import java.util.*;

import javax.swing.text.html.HTMLDocument.Iterator;

public class vector {
    public static void main(String[] args) {
        Vector<String>v=new Vector<String>();
        v.add("akku");
        v.add("arpit");
        v.add("lakshay");
        Iterator<String>itr=v.iterator();
        while(itr.hasNext()){
        System.out.println(itr.next);
        }
        System.out.println(v);
    }
    
}
