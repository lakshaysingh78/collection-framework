package collectionFramework;
import java.io.SequenceInputStream;
//array me dynamically size change ni ho skta but in array list me ho skta han
//array list list ke end me koi bhi function add krdeta han'
import java.util.*;
public class Arraylist{
     public static void main(String[]args){
        ArrayList<Integer> list=new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        list.add(60);
        list.add(70);
        System.out.println(list);
        for(int i=0;i<list.size();i++){
       System.out.println("the element is"+ list.get(i));

        }
        for(Integer element:list){
         System.out.println("for each element is"+ element);
        }
        Iterator<Integer>it=list.iterator();
        //has next tells about the that next element is present
        while(it.hasNext()){
         System.out.println("iterator "+ it.next());
        }

      //   //add in the middle sumwhere
      //   list.add(1,40);
      //   System.out.println(list);
      //   //new list ad krna purani wali me
      //   ArrayList<Integer> newlist=new ArrayList<>();
      //   newlist.add(100);
      //   newlist.add(200);
      //   list.addAll(newlist);
      //   System.out.println(list);
      //   System.out.println(list.get(2));
      //   System.out.println(list);
      //   //remove
      //   list.remove(0);
      //   list.remove(Integer.valueOf(200));
      //   System.out.println(list);
      //  // list.clear();//puri list remove krdega
      //  list.set(2,2000);
      //  System.out.println(list);
      //  //ive true or falls
      //  System.out.println(list.contains(100));;


        
     }

}